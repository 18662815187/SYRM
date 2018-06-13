package com.lwyykj.core.service;


import com.lwyykj.core.bean.hps.Pharmacy;

/**
 * 药店对象服务
 * @author john
 *
 */

public interface PharmacyService {
	//通过手机号查询药店对象
	public Pharmacy selectByTel(String tel);
	//通过手机号重置密码
	public int updateByTel(String tel,Pharmacy pharmacy);
	//通过ID查询药店对象
	public Pharmacy selectById(int id);
	//更新
	public int updateById(Pharmacy pharmacy);
	//根据id和对象更新
	public int updateById(int id, Pharmacy pharmacy);
	//通过药房id查询审核状态
	public Pharmacy findIsShow(Integer id);
	
}
