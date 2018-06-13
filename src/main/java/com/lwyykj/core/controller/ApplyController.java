package com.lwyykj.core.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lwyykj.core.bean.hps.HisPh;
import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.bean.hps.WithDrawals;
import com.lwyykj.core.service.HisPhService;
import com.lwyykj.core.service.PharmacyService;
import com.lwyykj.core.service.WithDrawalsService;

import cn.itcast.common.page.Pagination;

/**
 * 申请提现接口
 * @author john
 *
 */

@Controller
@RequestMapping("/apply")
public class ApplyController {
	@Resource
	private WithDrawalsService withDrawalsService;
	@Resource
	private PharmacyService pharmacyService;
	@Resource
	private HisPhService hisPhService;

	@RequestMapping("/toApply")
	public String toApply(HttpServletRequest request, Model model) {
		int uid = (int) request.getSession().getAttribute("pid");
		Pharmacy pharmacy = pharmacyService.selectById(uid);
		if (null != pharmacy) {
			model.addAttribute("pharmacy", pharmacy);
		}
		WithDrawals withDraw = withDrawalsService.selectById(uid);
		if (null != withDraw) {
			model.addAttribute("withDraw", withDraw);
		}
		return "/withDraw/withdraw";
	}

	@RequestMapping("/submitApply")
	@ResponseBody
	public Object submit(WithDrawals withDrawals, HttpServletRequest request) {
		HisPh hisPh = new HisPh();
		Map<String, Object> map = new HashMap<>();
		int uid = (int) request.getSession().getAttribute("pid");
		Pharmacy pharmacy = pharmacyService.findIsShow(uid);
		if (null != withDrawals.getBanknum()) {
			if (null != withDrawals.getBankname()) {
				if (null != withDrawals.getName()) {
					if (null != withDrawals.getTel()) {
						if (null != withDrawals.getMoney()) {
							// 变更前金额
							BigDecimal money = pharmacy.getMoney();
							// 提现金额
							BigDecimal money2 = withDrawals.getMoney();
							// 相减之后的金额
							BigDecimal bigDecimal = money.subtract(money2);
//							System.out.println(bigDecimal);
							// 大于0返回1
							if (bigDecimal.compareTo(BigDecimal.ZERO) == 1||bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
								hisPh.setPhId(uid);
								hisPh.setMoney(withDrawals.getMoney());
								hisPh.setMoney1(money);
								hisPh.setMsg("提现申请金额为：" + money2);
								hisPh.setStyle(1);
								hisPh.setAddtime(new Date());
								hisPhService.save(hisPh);
								pharmacy.setMoney(bigDecimal);
								int a = pharmacyService.updateById(pharmacy);
								if (a > 0) {
									withDrawals.setPhId(uid);
									withDrawals.setMsg("提现金额为："+withDrawals.getMoney());
									withDrawals.setAddtime(new Date());
									int result = withDrawalsService.save(withDrawals);
									if (result > 0) {
										// 申请成功请耐心等待
										map.put("status", 1);
										map.put("error", "申请成功请耐心等待！");
									} else {
										// 申请记录保存失败
										map.put("status", 0);
										map.put("error", "创建申请记录失败，请联系客服，电话0571-83731253");
									}
								} else {
									// 药店余额更新失败!
									map.put("status", 2);
									map.put("error", "更新余额失败，请联系客服，电话0571-83731253");
								}

							} else {
								// 提现金额不能超过您的余额！
								map.put("status", 3);
								map.put("error", "提现金额不能超过可用余额！");
							}
						} else {
							map.put("status", 8);
							map.put("error", "提现金额不能为空!");
						}
					} else {
						map.put("status", 7);
						map.put("error", "银行预留手机号不能为空！");
					}
				} else {
					map.put("status", 6);
					map.put("error", "真实姓名不能为空");
				}
			} else {
				map.put("status", 5);
				map.put("error", "银行名称不能为空！");
			}
		} else {
			map.put("status", 4);
			map.put("error", "银行卡号不能为空");
		}

		return map;
	}

	@RequestMapping("/list.do")
	public String list(Model model,Integer pageNo,HttpServletRequest request) {
		Pagination pagination = withDrawalsService.selectPaginationByQuery(pageNo, request);
		if (null != pagination) {
			model.addAttribute("pagination", pagination);
		}
		return "/withDraw/list";
	}
}
