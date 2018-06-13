package com.lwyykj.core.dao.report;

import com.lwyykj.core.bean.report.ReportPro;
import com.lwyykj.core.bean.report.ReportProQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportProDao {
	int countByExample(ReportProQuery example);

	int deleteByExample(ReportProQuery example);

	int insert(ReportPro record);

	int insertSelective(ReportPro record);

	List<ReportPro> selectByExample(ReportProQuery example);

	int updateByExampleSelective(@Param("record") ReportPro record, @Param("example") ReportProQuery example);

	int updateByExample(@Param("record") ReportPro record, @Param("example") ReportProQuery example);

	// 有产品名参数传入时
	List<ReportPro> selectByPhId(Integer phId);

	// 无产品名参数传入时参数传入时
	List<ReportPro> selectByPhIdAndProName(Integer phId, String proName);
}