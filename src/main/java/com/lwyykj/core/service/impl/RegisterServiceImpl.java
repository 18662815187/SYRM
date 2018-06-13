package com.lwyykj.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.dao.hps.PharmacyDao;
import com.lwyykj.core.service.RegisterService;

/**
 * 注册
 * 
 * @author john
 *
 */
@Service("registerService")
@Transactional
public class RegisterServiceImpl implements RegisterService {
	@Resource
	private PharmacyDao pharmacyDao;

	// 注册
	@Override
	public int insertPharmacy(Pharmacy pharmacy) {
		int result = pharmacyDao.insertSelective(pharmacy);
		return result;
	}

}
