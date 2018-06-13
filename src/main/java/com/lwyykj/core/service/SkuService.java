package com.lwyykj.core.service;

import java.math.BigDecimal;
import java.util.List;

import com.lwyykj.core.bean.product.Sku;

public interface SkuService {
	// 通过药店ID查询记录
	public List<Sku> selectByPid(int id);

	// 通过药店ID和产品ID找到sku对象
	public List<Sku> selectByPidProId(int pid, int proId);


	// 根据sku_id查询sku
	public Sku findById(Integer id);
	
	//根据id更新is_del
	public int deleteById(Integer id);
	
	//根据id更新店内售价和库存
	public int updateById(Integer id,BigDecimal price,Integer stock);
	
	//根据产品ID和药房ID查询对象
	public Sku findByPid(Integer pid,Integer phId);
	//发货减库存
	public int updateById(Sku sku);
}

