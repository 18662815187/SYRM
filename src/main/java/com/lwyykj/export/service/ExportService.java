package com.lwyykj.export.service;

import javax.servlet.ServletOutputStream;

public interface ExportService {
	//报表导出
	public void export(String[] titles, ServletOutputStream out,String time,String proName,Integer phId);
	//订单导出
	public void export1(String[] titles, ServletOutputStream out,String time,String tel,Integer phId,Integer style,Integer opstyle);
}
