package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.lwyykj.core.bean.hps.WithDrawals;
import com.lwyykj.core.bean.hps.WithDrawalsQuery;
import com.lwyykj.core.bean.hps.WithDrawalsQuery.Criteria;
import com.lwyykj.core.dao.hps.WithDrawalsDao;
import com.lwyykj.core.service.WithDrawalsService;

import cn.itcast.common.page.Pagination;

@Service("withDrawalsService")
public class WithDrawalsServiceImpl implements WithDrawalsService {
	@Resource
	private WithDrawalsDao withDrawalsDao;

	// 抽取最新一条记录
	@Override
	public WithDrawals selectById(Integer uid) {
		WithDrawalsQuery withDrawalsQuery = new WithDrawalsQuery();
		withDrawalsQuery.setOrderByClause("id desc");
		Criteria createCriteria = withDrawalsQuery.createCriteria();
		createCriteria.andPhIdEqualTo(uid);
		List<WithDrawals> withDrawals = withDrawalsDao.selectByExample(withDrawalsQuery);
		if (null != withDrawals && withDrawals.size() > 0) {
			return withDrawals.get(0);
		}
		return null;
	}

	// 插入记录
	@Override
	public int save(WithDrawals withDrawals) {
		int result = withDrawalsDao.insertSelective(withDrawals);
		return result;
	}

	// 查询药店的所有记录
	@Override
	public List<WithDrawals> findByUid(Integer uid) {
		WithDrawalsQuery withDrawalsQuery = new WithDrawalsQuery();
		Criteria createCriteria = withDrawalsQuery.createCriteria();
		createCriteria.andPhIdEqualTo(uid);
		List<WithDrawals> withDrawals = withDrawalsDao.selectByExample(withDrawalsQuery);
		if (null != withDrawals && withDrawals.size() > 0) {
			return withDrawals;
		}
		return null;
	}

	// 列表分页
	public Pagination selectPaginationByQuery(Integer pageNo, HttpServletRequest request) {
		StringBuilder params = new StringBuilder();
		int uid = (int) request.getSession().getAttribute("pid");
		WithDrawalsQuery withDrawalsQuery = new WithDrawalsQuery();
		withDrawalsQuery.setPageSize(20);
		withDrawalsQuery.setPageNo(Pagination.cpn(pageNo));
		withDrawalsQuery.setOrderByClause("id desc");
		Criteria createCriteria = withDrawalsQuery.createCriteria();
		createCriteria.andPhIdEqualTo(uid);
		List<WithDrawals> withDrawals = withDrawalsDao.selectByExample(withDrawalsQuery);
		if (null != withDrawals && withDrawals.size() > 0) {
			Pagination pagination = new Pagination(withDrawalsQuery.getPageNo(), withDrawalsQuery.getPageSize(),
					withDrawalsDao.countByExample(withDrawalsQuery), withDrawals);
			String url = "/apply/list.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}
}
