package com.lwyykj.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwyykj.core.bean.hps.HisPh;
import com.lwyykj.core.dao.hps.HisPhDao;
import com.lwyykj.core.service.HisPhService;
/**
 * 新增操作记录
 * @author john
 *
 */
@Service("hisPhService")
public class HisPhServiceImpl implements HisPhService{
	@Resource
	private HisPhDao hisPhDao;

	@Override
	public int save(HisPh hisPh) {
		int result=hisPhDao.insertSelective(hisPh);
		return result;
	}

}
