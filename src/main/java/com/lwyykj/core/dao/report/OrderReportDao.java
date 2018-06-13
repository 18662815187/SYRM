package com.lwyykj.core.dao.report;

import com.lwyykj.core.bean.report.OrderReport;
import com.lwyykj.core.bean.report.OrderReportQuery;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderReportDao {
	int countByExample(OrderReportQuery example);

	int deleteByExample(OrderReportQuery example);

	int insert(OrderReport record);

	int insertSelective(OrderReport record);

	List<OrderReport> selectByExample(OrderReportQuery example);

	int updateByExampleSelective(@Param("record") OrderReport record, @Param("example") OrderReportQuery example);

	int updateByExample(@Param("record") OrderReport record, @Param("example") OrderReportQuery example);

	// 查询相加复合条件的全部
	int sumNum(int phId, int proId);

	// 查询相加复合时间条件的全部
	int sunNum(int phId, int proId, int a, int b);

	// 查询相加复合用户条件的金额
	BigDecimal sumMoney(int phId, int proId);

	// 查询相加复合用户、时间条件的金额
	BigDecimal sunMoney(int phId, int proId, int a, int b);

	// 查询当前用户复合时间段的总金额
	BigDecimal sumAllMoney(int phId, int a, int b);

	// 统计当前用户销售总额
	BigDecimal sunAllMoney(int phId);
}