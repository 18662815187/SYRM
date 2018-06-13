package com.lwyykj.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lwyykj.core.bean.product.Brand;
import com.lwyykj.core.bean.product.Sku;
import com.lwyykj.core.service.BrandService;
import com.lwyykj.core.service.ProductService;
import com.lwyykj.core.service.SkuService;

import cn.itcast.common.page.Pagination;

/**
 * 产品控制器
 *
 * @author john
 *
 */
@Controller
@RequestMapping("/product")
public class ProductController {
	@Resource
	private BrandService brandService;
	@Resource
	private ProductService productService;
	@Resource
	private SkuService skuService;

	 //查询
	@RequestMapping("/list2.do")
	public String list(Model model, Integer brandId, Integer pageNo, String name, HttpServletRequest request) {
		Integer uid = (Integer) request.getSession().getAttribute("pid");
		List<Sku> skus = skuService.selectByPid(uid);
		if (null != skus && skus.size() > 0) {
			List<Brand> brands = brandService.selectBrandListByQuery(false);
			if (brands != null && brands.size() > 0) {
				model.addAttribute("brands", brands);
			}
			Pagination pagination = productService.selectPaginationByQuery(pageNo, name, brandId, uid);
			model.addAttribute("pagination", pagination);
			model.addAttribute("name", name);
			model.addAttribute("brandId", brandId);
		}
		return "product/list";
	}

	// 查询1
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("/list1.do")
	@ResponseBody
	public Object list1(Model model, Integer brandId, Integer pageNo, String name, Integer uid) {
		Map<String, Object> map = new HashMap<>();
		List<Brand> brands = brandService.selectBrandListByQuery(false);
		if (brands != null && brands.size() > 0) {
			model.addAttribute("brands", brands);
			map.put("brands", brands);
		}
		Pagination pagination = productService.selectPaginationByQuery(pageNo, name, brandId, uid);
		model.addAttribute("pagination", pagination);
		model.addAttribute("name", name);
		model.addAttribute("brandId", brandId);
		map.put("pagination", pagination);
		return map;
	}
}
