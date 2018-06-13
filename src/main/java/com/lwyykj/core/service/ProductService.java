package com.lwyykj.core.service;

import com.lwyykj.core.bean.product.ProductStandard;
import com.lwyykj.core.bean.product.ProductStandardQuery;
import cn.itcast.common.page.Pagination;

public interface ProductService {
	// 列表页返回分页对象
	public Pagination selectPaginationByQuery(Integer pageNo, String name, Integer brandId, Integer uid);

	// 根据条件查询商品
	public ProductStandard findPro(ProductStandardQuery productStandardQuery);

	// 根据产品ID取产品对象
	public ProductStandard findById(Integer id);
	
	//根据ID查询工厂ID
	public int findByPid(int id);
}
