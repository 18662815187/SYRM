package com.lwyykj.core.service;

import javax.servlet.http.HttpServletRequest;

import com.lwyykj.core.bean.product.ProductVerify;

import cn.itcast.common.page.Pagination;

public interface ProductVerifyService {
	// 列表页返回分页对象
	public Pagination selectPaginationByQuery(Integer pageNo, String name,HttpServletRequest request);

	// 单删(更新假删除)
	public int deleteById(Integer id);
	
	//根据id查询
	
	public ProductVerify selectById(Integer id);
	
	//新增
	public int save(ProductVerify product);
	
	//更新
	public int update(ProductVerify product);
}
