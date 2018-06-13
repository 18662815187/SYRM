package com.lwyykj.core.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.hps.Hospital;
import com.lwyykj.core.dao.hps.HospitalDao;
import com.lwyykj.core.service.HospitalService;

/**
 * 医院服务实现类
 * 
 * @author john
 *
 */
@Service("hospitalService")
@Transactional
public class HospitalServiceImpl implements HospitalService {
	@Resource
	private HospitalDao hospitalDao;

	// 通过id查询
	@Override
	public Hospital findByID(int id) {
		Hospital hospital = hospitalDao.selectByPrimaryKey(id);
		if (hospital != null) {
			return hospital;
		}
		return null;
	}

}
