package com.lwyykj.core.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.bean.product.Brand;
import com.lwyykj.core.bean.product.ProductVerify;
import com.lwyykj.core.service.BrandService;
import com.lwyykj.core.service.PharmacyService;
import com.lwyykj.core.service.ProductVerifyService;

import cn.itcast.common.page.Pagination;

@Controller
@RequestMapping("/Pvc")
public class ProductVerifyController {
	@Resource
	private BrandService brandService;
	@Resource
	private ProductVerifyService productVerifyService;
	@Resource
	private PharmacyService pharmacyService;

	// 列表页
	@RequestMapping("/list.do")
	public String list(String name, Integer pageNo, Model model, HttpServletRequest request) {
		List<Brand> brands = brandService.selectBrandListByQuery(false);
		model.addAttribute("brands", brands);
		model.addAttribute("name", name);
		Pagination pagination = productVerifyService.selectPaginationByQuery(pageNo, name, request);
		model.addAttribute("pagination", pagination);
		return "/productVerify/list";
	}

	// 添加更新
	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public Object saveOrUpdate(ProductVerify product, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		if (null != product.getProductName() && "" != product.getProductName()) {
			if (null != product.getBrandName() && "" != product.getBrandName()) {
				if (null != product.getSpec() && "" != product.getSpec()) {
					if (null != product.getStock()) {
						if (null != product.getFactoryName() && "" != product.getFactoryName()) {
							if (null != product.getPrice()) {
								if (null != product.getId() && product.getId() > 0) {
									int a = productVerifyService.update(product);
									if (a > 0) {
										map.put("status", 1);
									}
								} else {
									Integer uid = (Integer) request.getSession().getAttribute("pid");
									product.setPhId(uid);
									int b = productVerifyService.save(product);
									if (b > 0) {
										map.put("status", 1);
									}
								}
							} else {
								map.put("status", 6);
								map.put("msg", "售价不能为空！");
							}
						} else {
							map.put("status", 5);
							map.put("msg", "生产厂家不能为空！");
						}
					} else {
						map.put("status", 4);
						map.put("msg", "库存不能为空！");
					}
				} else {
					map.put("status", 3);
					map.put("msg", "规格不能为空！");
				}
			} else {
				map.put("status", 2);
				map.put("msg", "品牌名称不能为空！");
			}
		} else {
			map.put("status", 0);
			map.put("msg", "产品名称不能为空！");
		}
		return map;
	}

	// 删除
	@RequestMapping("/delete")
	public String delete(Integer id, Integer uid) {
		int result = productVerifyService.deleteById(id);
		if (result > 0) {
			return "forward:/Pvc/list.do";
		}
		return null;
	}

	// 批量删除
	@RequestMapping("/deletes.do")
	public String deletes(Integer[] ids) {
		for (int i = 0; i < ids.length; i++) {
			Integer a = ids[i];
			productVerifyService.deleteById(a);
		}
		return "forward:/Pvc/list.do";
	}

	// 去编辑页
	@RequestMapping("/toEdit.do")
	public String tpEdit(Integer id, Model model) {
		ProductVerify product = productVerifyService.selectById(id);
		model.addAttribute("product", product);
		return "/productVerify/edit";
	}

	// json数据测试
	@RequestMapping("/edit")
	@ResponseBody
	public Object edit(int id) {
		ProductVerify selectById = productVerifyService.selectById(id);
		Map<String, Object> map = new HashMap<>();
		map.put("a", selectById);
		return map;
	}

	// 到添加页面
	@RequestMapping("/toAdd.do")
	public String toAdd(HttpServletRequest request, Model model) {
		Integer uid = (int) request.getSession().getAttribute("pid");
		Pharmacy pharmacy = pharmacyService.findIsShow(uid);
		if (null != pharmacy) {
			int isshow = pharmacy.getIsShow();
			if (isshow == 1) {
				return "/productVerify/edit";
			} else if (isshow == 0) {
				model.addAttribute("msg", "请上传审核资料，如有疑问请咨询客服，客服电话：0571-83731253");
				return "/auth/auth";
			} else {
				model.addAttribute("pharmacy", pharmacy);
				model.addAttribute("msg", "请耐心等待审核，如有疑问请咨询客服，客服电话：0571-83731253");
				return "/auth/auth2";
			}
		}
		return null;
	}
}
