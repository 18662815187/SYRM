package com.lwyykj.core.controller;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lwyykj.common.EncodePassword;
import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.bean.utils.Vercode;
import com.lwyykj.core.service.PharmacyService;
import com.lwyykj.core.service.RegisterService;
import com.lwyykj.core.service.VerCodeService;

/**
 * 注册控制器
 * 
 * @author john
 *
 */

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Resource
	private VerCodeService verCodeService;
	@Resource
	private RegisterService registerService;
	@Resource
	private PharmacyService pharmacyService;

	// 去注册页面
	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}

	// 提交注册
	@RequestMapping("/reg")
	@ResponseBody
	public Object reg(String code, String pharmacyName, String tel, String pwd, String password, String manager,
			String hosName, Byte type, String address) {
		Map<String, Object> map = new HashMap<>();
		Pharmacy pharmacy = new Pharmacy();
		if (null != tel) {
			if (null != code) {
				if (null != password || null != pwd) {
					if (null != pharmacyName) {
						if (null != manager) {
							if (password.equals(pwd)) {
								Vercode vercode = verCodeService.selectByTel(tel);
								if(null!=vercode){
									if (code.equals(vercode.getVercode())) {
										Pharmacy selectByTel = pharmacyService.selectByTel(tel);
										if (null==selectByTel) {
											pharmacy.setTel(tel);
											pharmacy.setPharmacyName(pharmacyName);
											pharmacy.setPassword(EncodePassword.encodePassword(password));
											pharmacy.setAddress(address);
											pharmacy.setManager(manager);
											pharmacy.setHosName(hosName);
											pharmacy.setType(type);
											pharmacy.setIsDel(false);
											pharmacy.setIsShow(0);
											int i = registerService.insertPharmacy(pharmacy);
											if (i > 0) {
												System.out.println("注册成功");
												verCodeService.delByTel(tel);
												map.put("status", 1);
											} else {
												map.put("status", 0);
												map.put("error", "服务异常，请联系管理员~！");
											}
										} else {
											map.put("status", 0);
											map.put("error", "此手机号已注册，请更换手机号！");
											verCodeService.delByTel(tel);
										}
									} else {
										map.put("status", 0);
										map.put("error", "输入的验证码不正确，请核对后重新输入！");
									}
								}else{
									map.put("status", 0);
									map.put("error", "非法验证码，请点击发送验证码按钮重新获取！");
								}
							} else {
								map.put("status", 0);
								map.put("error", "两次输入的密码不一致！");
							}
						} else {
							map.put("status", 0);
							map.put("error", "负责人不能为空！");
						}
					} else {
						map.put("status", 0);
						map.put("error", "药店名称不能为空！");
					}
				} else {
					map.put("status", 0);
					map.put("error", "密码不能为空");
				}
			} else {
				map.put("status", 0);
				map.put("error", "验证码不能为空！");
			}
		} else {
			map.put("status", 0);
			map.put("error", "手机号不能为空！");
		}
		return map;
	}
}
