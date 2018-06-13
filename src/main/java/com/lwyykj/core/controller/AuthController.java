package com.lwyykj.core.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.service.PharmacyService;

/**
 * 认证页
 * 
 * @author john
 *
 */

@Controller
@RequestMapping("/auth")
public class AuthController {
	@Resource
	private PharmacyService pharmacyService;

	// 去认证页
	@RequestMapping("/toAuth")
	public String toAuth(Model model,HttpServletRequest request) {
		int id = (int) request.getSession().getAttribute("pid");
		Pharmacy pharmacy = pharmacyService.selectById(id);
		model.addAttribute("pharmacy", pharmacy);
		return "auth/auth";
	}

	// 提交更新
	@RequestMapping("/passPort")
	public String toAuth(Pharmacy pharmacy,Model model, String imgUrl1, String imgUrl2, String imgUrl3, String imgUrl4) throws UnsupportedEncodingException {
		pharmacy.setAuthImg(imgUrl1 + "," + imgUrl2 + "," + imgUrl3 + "," + imgUrl4);
		pharmacy.setIsShow(2);
		int result = pharmacyService.updateById(pharmacy);
		if (result > 0) {
			model.addAttribute("msg", "提交成功，请刷新浏览器页面！");
			return "auth/auth";
		}
		model.addAttribute("msg", "提交失败，请重试！");
		return "auth/auth";
	}
}
