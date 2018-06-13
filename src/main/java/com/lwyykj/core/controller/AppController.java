package com.lwyykj.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwyykj.core.bean.app.Msg;
import com.lwyykj.core.service.MsgService;

@Controller
public class AppController {

	@Resource
	private MsgService msgService;

	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("/msg.do")
	@ResponseBody
	public Object findAllMsg(Integer id) {
		Map<String, Object> map = new HashMap<>();
		List<Msg> msgs = msgService.findById(id);
		if (msgs != null && msgs.size() > 0) {
			map.put("msgs", msgs);
			map.put("status", 1);
			map.put("msg", "查询成功");
		}else{
			map.put("msg", "无数据");
		}
		return map;
	}
}
