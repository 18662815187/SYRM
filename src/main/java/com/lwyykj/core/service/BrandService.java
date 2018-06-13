package com.lwyykj.core.service;

import java.util.List;

import com.lwyykj.core.bean.product.Brand;

public interface BrandService {
	public List<Brand> selectBrandListByQuery(Boolean isDel);

	// 通过id查询
	public Brand findById(int id);
}
