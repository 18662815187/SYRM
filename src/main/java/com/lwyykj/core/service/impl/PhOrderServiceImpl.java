package com.lwyykj.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.product.PharmacyOrder;
import com.lwyykj.core.dao.product.PharmacyOrderDao;
import com.lwyykj.core.service.PhOrderService;

/**
 * 药店订单小单
 * @author john
 *
 */
@Service("phOrderService")
@Transactional
public class PhOrderServiceImpl implements PhOrderService{
	@Resource
	private PharmacyOrderDao pharmacyOrderDao;
	//根据ID查询
	@Override
	public PharmacyOrder selectById(Integer id) {
		return pharmacyOrderDao.selectByPrimaryKey(id);
	}
	@Override
	public int updateById(PharmacyOrder pharmacyOrder) {
		int result = pharmacyOrderDao.updateByPrimaryKeySelective(pharmacyOrder);
		return result;
	}
	
}
