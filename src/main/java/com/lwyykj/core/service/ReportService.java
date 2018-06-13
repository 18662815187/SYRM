package com.lwyykj.core.service;



import javax.servlet.http.HttpServletRequest;



import cn.itcast.common.page.Pagination;

/**
 * 报表服务
 * 
 * @author john
 *
 */
public interface ReportService {
	// 列表带分页
	public Pagination selectPaginationByQuery(Integer pageNo, String proName, String time, HttpServletRequest request);

}
