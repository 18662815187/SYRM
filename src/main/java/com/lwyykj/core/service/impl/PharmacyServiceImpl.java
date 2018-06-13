package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.hps.Hospital;
import com.lwyykj.core.bean.hps.Pharmacy;
import com.lwyykj.core.bean.hps.PharmacyQuery;
import com.lwyykj.core.bean.hps.PharmacyQuery.Criteria;
import com.lwyykj.core.dao.hps.HospitalDao;
import com.lwyykj.core.dao.hps.PharmacyDao;
import com.lwyykj.core.service.PharmacyService;

@Service("pharmacyService")
@Transactional
public class PharmacyServiceImpl implements PharmacyService {

	@Resource
	private PharmacyDao pharmacyDao;
	@Resource
	private HospitalDao hospitalDao;

	// 通过手机号查询药店对象
	@Override
	public Pharmacy selectByTel(String tel) {
		PharmacyQuery pharmacyQuery = new PharmacyQuery();
		Criteria createCriteria = pharmacyQuery.createCriteria();
		createCriteria.andTelEqualTo(tel);
		List<Pharmacy> pharmacies = pharmacyDao.selectByExample(pharmacyQuery);
		if (null != pharmacies && pharmacies.size() > 0) {
			return pharmacies.get(0);
		}
		return null;
	}

	// 通过手机号重置密码
	public int updateByTel(String tel, Pharmacy pharmacy) {
		int result = 0;
		PharmacyQuery pharmacyQuery = new PharmacyQuery();
		Criteria createCriteria = pharmacyQuery.createCriteria();
		createCriteria.andTelEqualTo(tel);
		result = pharmacyDao.updateByExample(pharmacy, pharmacyQuery);
		return result;
	}

	// 通过id查询药店对象
	@Override
	public Pharmacy selectById(int id) {
		Hospital hospital = hospitalDao.selectByPrimaryKey(pharmacyDao.selectByPrimaryKey(id).getHosId());
		Pharmacy pharmacy = pharmacyDao.selectByPrimaryKey(id);
		pharmacy.setHospital(hospital);
		return pharmacy;
	}

	// 更新
	@Override
	public int updateById(Pharmacy pharmacy) {
		int result = pharmacyDao.updateByPrimaryKeySelective(pharmacy);
		return result;
	}

	// 通过手机号重置密码
	public int updateById(int id, Pharmacy pharmacy) {
		int result = 0;
		PharmacyQuery pharmacyQuery = new PharmacyQuery();
		Criteria createCriteria = pharmacyQuery.createCriteria();
		createCriteria.andIdEqualTo(id);
		result = pharmacyDao.updateByExample(pharmacy, pharmacyQuery);
		return result;
	}

	@Override
	public Pharmacy findIsShow(Integer id) {
		PharmacyQuery pharmacyQuery = new PharmacyQuery();
		Criteria createCriteria = pharmacyQuery.createCriteria();
		createCriteria.andIdEqualTo(id);
		List<Pharmacy> phs = pharmacyDao.selectByExample(pharmacyQuery);
		if (null != phs && phs.size() > 0) {
			return phs.get(0);
		}
		return null;
	}
}
