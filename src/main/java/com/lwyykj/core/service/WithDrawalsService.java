package com.lwyykj.core.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lwyykj.core.bean.hps.WithDrawals;

import cn.itcast.common.page.Pagination;

public interface WithDrawalsService {
	//通过用户ID查询最新的申请记录
	public WithDrawals selectById(Integer uid);
	//保存
	public int save(WithDrawals withDrawals);
	//根据用户ID 查询所有数据
	public List<WithDrawals> findByUid(Integer uid);
	//分页
	public Pagination selectPaginationByQuery(Integer pageNo, HttpServletRequest request);
}
