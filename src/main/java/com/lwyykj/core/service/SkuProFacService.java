package com.lwyykj.core.service;
import cn.itcast.common.page.Pagination;

public interface SkuProFacService {
	//查询所有复合条件的数据,分页对象
	Pagination selectPaginationByQuery(Integer pageNo, String name, Integer brandId, Integer uid);
}
