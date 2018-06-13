package com.lwyykj.export.service;

import java.util.List;

import com.lwyykj.core.bean.report.ReportPro;

public interface ReportListService {
	//导出报表
	public List<ReportPro> getList(String time, String proName, Integer phId);
}
