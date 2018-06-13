package com.lwyykj.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwyykj.core.bean.product.Brand;
import com.lwyykj.core.service.BrandService;
import com.lwyykj.core.service.SkuProFacService;
import com.lwyykj.core.service.SkuService;

import cn.itcast.common.page.Pagination;

/**
 * 商品列表控制器
 * 
 * @author john
 *
 */
@Controller
@RequestMapping("/spf")
public class SkuProFacController {
	@Resource
	private BrandService brandService;
	@Resource
	private SkuProFacService skuProFacService;
	@Resource
	private SkuService skuService;

	@RequestMapping("/list.do")
	public String toProList(HttpServletRequest request, String name, Integer brandId, Integer pageNo, Model model) {
		Integer uid = (Integer) request.getSession().getAttribute("pid");
		List<Brand> brands = brandService.selectBrandListByQuery(false);
		model.addAttribute("name", name);
		model.addAttribute("brandId", brandId);
		if (brands != null && brands.size() > 0) {
			model.addAttribute("brands", brands);
		}
		Pagination pagination = skuProFacService.selectPaginationByQuery(pageNo, name, brandId, uid);
		if (null != pagination) {
			model.addAttribute("pagination", pagination);
		}
		return "product/list";
	}

	@RequestMapping("/list1.do")
	@ResponseBody
	public Object toProList1(Integer uid, String name, Integer brandId, Integer pageNo, Model model) {
		Map<String, Object> map = new HashMap<>();
		List<Brand> brands = brandService.selectBrandListByQuery(false);
		model.addAttribute("name", name);
		if (brands != null && brands.size() > 0) {
			model.addAttribute("brands", brands);
		}
		Pagination pagination = skuProFacService.selectPaginationByQuery(pageNo, name, brandId, uid);
		if (null != pagination) {
			model.addAttribute("pagination", pagination);
			map.put("pagination", pagination);
		}
		return map;
	}

	@RequestMapping("/delete")
	public String deleteById(Integer id, Integer uid, Model model) {
		int result = skuService.deleteById(id);
		if (result > 0) {
			// model.addAttribute("uid", uid);
			return "forward:/spf/list.do";
		}
		return null;
	}

	// 批量删除
	@RequestMapping("/deletes.do")
	public String deletes(Integer[] ids) {
		for (int i = 0; i < ids.length; i++) {
			Integer a = ids[i];
			skuService.deleteById(a);
		}
		return "forward:/spf/list.do";
	}

	// 到添加页面
	@RequestMapping("/toAdd.do")
	public String toAdd() {
		return "/productVerify/edit";
	}

	
}
