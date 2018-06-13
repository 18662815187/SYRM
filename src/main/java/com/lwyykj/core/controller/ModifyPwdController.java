package com.lwyykj.core.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwyykj.common.EncodePassword;
import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.bean.utils.Vercode;
import com.lwyykj.core.service.PharmacyService;
import com.lwyykj.core.service.VerCodeService;

/**
 * 修改密码
 * 
 * @author john
 *
 */
@Controller
@RequestMapping("/modifyPwd")
public class ModifyPwdController {
	@Resource
	private PharmacyService pharmacyService;
	@Resource
	private VerCodeService verCodeService;

	// 去修改页面
	@RequestMapping("/toModify")
	public String toModify(Model model, HttpServletRequest request) {
		int id = (int) request.getSession().getAttribute("pid");
		Pharmacy pharmacy = pharmacyService.selectById(id);
		model.addAttribute("pharmacy", pharmacy);
		return "Modify_pwd";
	}

	// 重置密码
	@RequestMapping("/czPwd")
	@ResponseBody
	public Object czPwd(String tel, String code, String password, String pwd) {
//		System.out.println(pharmacy1.getTel());
		Map<String, Object> map = new HashMap<>();
		if (null != tel) {
			if (null != code) {
				if (null != password && null != pwd) {
					Vercode vercode = verCodeService.selectByTel(tel);
					if (null != vercode) {
						if (code.equals(vercode.getVercode())) {
							if (password.equals(pwd)) {
								Pharmacy pharmacy = pharmacyService.selectByTel(tel);
								if (null != pharmacy) {
									pharmacy.setPassword(EncodePassword.encodePassword(password));
									int result = pharmacyService.updateByTel(tel, pharmacy);
									if (result > 0) {
										System.out.println("修改成功！");
										verCodeService.delByTel(tel);
										map.put("status", 1);
									} else {
										System.out.println("修改失败！");
										map.put("status", 0);
										map.put("error", "修改失败，请重试！");
									}
								} else {
									map.put("status", 0);
									map.put("error", "此手机号并未注册，请先注册！");
									verCodeService.delByTel(tel);
								}
							} else {
								map.put("status", 0);
								map.put("error", "两次输入的密码不一致！");
							}

						} else {
							map.put("status", 0);
							map.put("error", "验证码输入不正确，请检查后再次输入！");
						}

					} else {
						map.put("status", 0);
						map.put("error", "非法验证码，请点击获取验证码按钮重新获取！");
					}

				} else {
					map.put("status", 0);
					map.put("error", "密码或重复密码不能为空!");
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
	//去修改手机号页面
	@RequestMapping("/toModifyPhone")
	public String toEditPhone(Model model,HttpServletRequest request){
		int id = (int) request.getSession().getAttribute("pid");
		Pharmacy pharmacy = pharmacyService.selectById(id);
		model.addAttribute("pharmacy", pharmacy);
		return "Modify_phone";
	}
	//手机号修改验证老号码
	@RequestMapping("/verfiyOldPhone")
	@ResponseBody
	public Object verfiyOldPhone(String tel,String code){
		Map<String, Object> map = new HashMap<>();
		if (null != tel) {
			if (null != code) {
					Vercode vercode = verCodeService.selectByTel(tel);
					if (null != vercode) {
						if (code.equals(vercode.getVercode())) {
								Pharmacy pharmacy = pharmacyService.selectByTel(tel);
								if (null != pharmacy) {
									map.put("status", 1);
									verCodeService.delByTel(tel);
								} else {
									map.put("status", 0);
									map.put("error", "此手机号并未注册，请先注册！");
									verCodeService.delByTel(tel);
								}
						} else {
							map.put("status", 0);
							map.put("error", "验证码输入不正确，请检查后再次输入！");
						}

					} else {
						map.put("status", 0);
						map.put("error", "非法验证码，请点击获取验证码按钮重新获取！");
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
	//去修改新手机号页面
	@RequestMapping("/toVerfiy")
	public String toVerfiy(Model model,HttpServletRequest request){
		int id = (int) request.getSession().getAttribute("pid");
		Pharmacy pharmacy = pharmacyService.selectById(id);
		model.addAttribute("pharmacy", pharmacy);
		return "Modify_phone_verfiy";
	}
	//提交修改新手机号
	@RequestMapping("/submit")
	@ResponseBody
	public Object submitNewPhone(Integer id,String tel,String code){
//		System.out.println(id);
//		System.out.println(tel);
//		System.out.println(code);
		Map<String, Object> map = new HashMap<>();
		if(null!=tel){
			if(null!=code){
				Vercode vercode = verCodeService.selectByTel(tel);
				if (null != vercode) {
					if (code.equals(vercode.getVercode())) {
							Pharmacy pharmacy = pharmacyService.selectById(id);
							if (null != pharmacy) {
								pharmacy.setTel(tel);
								pharmacyService.updateById(id, pharmacy);
								map.put("status", 1);
								map.put("msg", "修改成功，请刷新浏览器重新登录！");
								verCodeService.delByTel(tel);
							} else {
								map.put("status", 0);
								map.put("error", "用户ID获取失败，请刷新网页后重试！");
								verCodeService.delByTel(tel);
							}
					} else {
						map.put("status", 0);
						map.put("error", "验证码输入不正确，请检查后再次输入！");
					}

				} else {
					map.put("status", 0);
					map.put("error", "非法验证码，请点击获取验证码按钮重新获取！");
				}
			}else{
				map.put("status", 0);
				map.put("error", "验证码不能为空！");
			}
		}else{
			map.put("status", 0);
			map.put("error", "手机号不能为空！");
		}
		return map;
	}
}
