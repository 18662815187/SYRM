package com.lwyykj.core.service;



import cn.itcast.common.page.Pagination;

public interface SupBrandService {
	public Pagination findBySid(Integer sid,Integer pageNo,String name);
}
