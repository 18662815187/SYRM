package com.lwyykj.core.controller;

import java.io.UnsupportedEncodingException;

//import java.util.HashMap;
//import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.service.HospitalService;
import com.lwyykj.core.service.PharmacyService;

/**
 * 个人资料
 * 
 * @author john
 *
 */

@Controller
@RequestMapping("/myInfo")
public class MyInfoController {
	@Resource
	private PharmacyService pharmacyService;
	@Resource
	private HospitalService hospitalService;

	// 去个人资料页面
	@RequestMapping("/editInfo")
	public String toMyInfo(Model model, HttpServletRequest request) {
		int id = (int) request.getSession().getAttribute("pid");
		Pharmacy pharmacy = pharmacyService.selectById(id);
		model.addAttribute("pharmacy", pharmacy);
		// Map<String, Object> map = new HashMap<>();
		// map.put("pharmacy", pharmacy);
		return "myInfo";
	}

	// 提交更新资料
	@RequestMapping("/saveUpdate")
	public String saveMyInfo(Pharmacy pharmacy, Model model,HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
//		System.out.println(pharmacy.getAddress());
		int result = pharmacyService.updateById(pharmacy);
		if (result > 0) {
			Pharmacy pharmacy1 = pharmacyService.selectById(pharmacy.getId());
			model.addAttribute("pharmacy", pharmacy1);
			model.addAttribute("msg", "信息修改成功！");
			return "myInfo";
		}
		return null;
	}
}
