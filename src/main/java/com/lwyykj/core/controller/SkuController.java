package com.lwyykj.core.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lwyykj.core.bean.product.Sku;
import com.lwyykj.core.service.SkuService;

@Controller
@RequestMapping("/sku")
public class SkuController {
	@Resource
	private SkuService skuService;

	// 到列表页
	@RequestMapping("/list.do")
	public String skuList(int id, Model model) {
		Sku sku = skuService.findById(id);
		if (null != sku) {
			model.addAttribute("sku", sku);
		}
		return "sku/list";
	}

	// 到列表页
	@RequestMapping("/list1.do")
	@ResponseBody
	public Object skuList1(Integer id) {
		Map<String, Object> map = new HashMap<>();
		Sku sku = skuService.findById(id);
		if (null != sku) {
			map.put("sku", sku);
		}
		return map;
	}

	// 库存管理提交
	@RequestMapping("/upSku.do")
	@ResponseBody
	public Map<String, Object> updateSku(Integer id, BigDecimal price, Integer stock) {
		Map<String, Object> map = new HashMap<>();
		int result = skuService.updateById(id, price, stock);
		if (result > 0) {
			map.put("message", "更新成功！");
		} else {
			map.put("message", "更新失败，请重试或者联系管理员！");
		}
		return map;
	}
}
