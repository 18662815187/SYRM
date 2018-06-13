package com.lwyykj.core.service;

import com.lwyykj.core.bean.product.PharmacyOrder;

public interface PhOrderService {
	//主键查询
	public PharmacyOrder selectById(Integer id);
	//根据主键更新
	public int updateById(PharmacyOrder pharmacyOrder);
}
