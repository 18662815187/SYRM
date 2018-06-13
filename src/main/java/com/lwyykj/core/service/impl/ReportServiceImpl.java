package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.lwyykj.core.bean.report.ReportPro;
import com.lwyykj.core.bean.report.ReportProQuery;
import com.lwyykj.core.bean.report.ReportProQuery.Criteria;
import com.lwyykj.core.dao.report.ReportProDao;
import com.lwyykj.core.service.ReportProService;
import com.lwyykj.core.service.ReportService;

import cn.itcast.common.page.Pagination;

@Service("reportService")
public class ReportServiceImpl implements ReportService {
	@Resource
	private ReportProDao reportProDao;
	@Resource
	private ReportProService reportProService;

	// 列表页
	@Override
	public Pagination selectPaginationByQuery(Integer pageNo, String proName, String time, HttpServletRequest request) {
		Integer phId = (Integer) request.getSession().getAttribute("pid");
		StringBuilder params = new StringBuilder();
		ReportProQuery reportProQuery = new ReportProQuery();
		reportProQuery.setPageNo(Pagination.cpn(pageNo));
		reportProQuery.setPageSize(20);
		Criteria createCriteria = reportProQuery.createCriteria();
		createCriteria.andPhIdEqualTo(phId);
		if (null != proName) {
			createCriteria.andProNameLike("%" + proName + "%");
			params.append("proName=").append(proName);
		}
		if (null != time) {
			params.append("&time=").append(time);
		}
		List<ReportPro> reports = reportProDao.selectByExample(reportProQuery);
		if (null != reports && reports.size() > 0) {
			for (ReportPro report : reports) {
				report.setTotalNum(reportProService.sumNum(report.getProId(), phId, time));
				report.setTotalFee(reportProService.sumMoney(report.getProId(), phId, time));
			}
			Pagination pagination = new Pagination(reportProQuery.getPageNo(), reportProQuery.getPageSize(),
					reportProDao.countByExample(reportProQuery), reports);
			String url = "/report/list.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}

		return null;
	}


}
