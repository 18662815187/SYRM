package com.lwyykj.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.core.bean.hps.Bank;
import com.lwyykj.core.dao.hps.BankDao;
import com.lwyykj.core.service.TestService;

@Service("TestService")
@Transactional
public class TestServiceImpl implements TestService {

	@Resource
	private BankDao BankDao;

	@Override
	public Bank selectById(int id) {
		return BankDao.selectByPrimaryKey(id);
	}

}
