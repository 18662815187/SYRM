package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.product.Factory;
import com.lwyykj.core.bean.product.FactoryQuery;
import com.lwyykj.core.bean.product.FactoryQuery.Criteria;
import com.lwyykj.core.dao.product.FactoryDao;
import com.lwyykj.core.service.FactoryService;

@Service("factoryService")
@Transactional
public class FactoryServiceImpl implements FactoryService {
	@Resource
	private FactoryDao factoryDao;

	// 根据ID查询
	@Override
	public Factory findById(int id) {
		FactoryQuery factoryQuery = new FactoryQuery();
		Criteria createCriteria = factoryQuery.createCriteria();
		createCriteria.andIdEqualTo(id);
		List<Factory> factorys = factoryDao.selectByExample(factoryQuery);
		if (null != factorys && factorys.size() > 0) {
			return factorys.get(0);
		}
		return null;
	}

}
