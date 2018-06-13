package com.lwyykj.core.service.impl;

import java.math.BigDecimal;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.lwyykj.common.FormatDate;
import com.lwyykj.core.bean.report.OrderReportQuery;
import com.lwyykj.core.dao.report.OrderReportDao;
import com.lwyykj.core.service.ReportProService;

@Service("reportProService")
public class ReportProServiceImpl implements ReportProService {
	@Resource
	private OrderReportDao orderReportDao;

	// 计算数量
	@Override
	public int sumNum(int proId, int phId, String time) {
		// System.out.println("这是统计"+"---------"+time+"--"+phId);
		int num = 0;
		String style = "yy-MM-dd";
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], style);
			b = FormatDate.formatDate(CanTime[1], style);
			if (a == b) {
				b += 86400;
			}
			num = orderReportDao.sunNum(phId, proId, a, b);
			// System.out.println(a + "--------" + b + "----------" + num);
		} else {
			num = orderReportDao.sumNum(phId, proId);
		}
		return num;
	}

	// 计算总金额
	@Override
	public BigDecimal sumMoney(int proId, int phId, String time) {
		// System.out.println("这是统计"+"---------"+time+"--"+phId);
		BigDecimal money = new BigDecimal(0);
		String style = "yy-MM-dd";
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], style);
			b = FormatDate.formatDate(CanTime[1], style);
			if (a == b) {
				b += 86400;
			}
			money = orderReportDao.sunMoney(phId, proId, a, b);
			// System.out.println(a + "--------" + b + "----------" + money);
		} else {
			money = orderReportDao.sumMoney(phId, proId);
		}
		return money;
	}

	@Override
	public int count() {
		OrderReportQuery orderReportQuery = new OrderReportQuery();
		int countByExample = orderReportDao.countByExample(orderReportQuery);
		return countByExample;
	}

	// 统计当前用户指定时间段内的销售总额
	@Override
	public BigDecimal sumAllMoney(int phId, String time) {
		BigDecimal money = new BigDecimal(0);
		String style = "yy-MM-dd";
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], style);
			b = FormatDate.formatDate(CanTime[1], style);
			if (a == b) {
				b += 86400;
			}
			money = orderReportDao.sumAllMoney(phId, a, b);
		} else {
			money = orderReportDao.sunAllMoney(phId);
		}
		return money;
	}

}
