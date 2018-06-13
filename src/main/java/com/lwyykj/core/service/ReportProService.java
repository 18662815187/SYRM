package com.lwyykj.core.service;

import java.math.BigDecimal;

/**
 * 报表统计服务
 * 
 * @author john
 *
 */
public interface ReportProService {
	// 统计数量
	public int sumNum(int proId, int phId, String time);

	// 统计总金额
	public BigDecimal sumMoney(int proId, int phId, String time);

	// 测试统计数量
	public int count();

	// 统计当前时间段，当前用户所有产品总金额
	public BigDecimal sumAllMoney(int phId, String time);
}
