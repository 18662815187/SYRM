package com.lwyykj.core.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
/**
 * 短信验证码
 * @author john
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwyykj.core.bean.utils.Vercode;
import com.lwyykj.core.service.VerCodeService;
import com.lwyykj.core.sms.TemplateSms;
import com.lwyykj.core.sms.utils.RandomUtil;

@Controller
public class RandomSmsCode {
	@Resource
	private VerCodeService verCodeService;

	// 短信验证码
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("/sendSms")
	@ResponseBody
	public Object sendSms(String tel) throws Exception {
		String code = RandomUtil.randomFor6();
		Vercode vercode = verCodeService.selectByTel(tel);
		if (null != vercode) {
			int r = verCodeService.delByTel(tel);
			if (r > 0) {
				System.out.println("删除老记录成功！");
			} else {
				System.out.println("老记录删除失败");
				return false;
			}
		}
		int i = verCodeService.insert(tel, code);
		if (i > 0)
			System.out.println("验证码写入成功！");

		Object result = TemplateSms.sendSms(tel, code);
		Map<String, Object> map = new HashMap<>();
		map.put("res_code", result);
		map.put("status", "1");
		map.put("msg", "success");
		// map.put("code", code);
		return map;
	}
}
