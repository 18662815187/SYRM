package com.lwyykj.export.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwyykj.core.bean.report.ReportPro;
import com.lwyykj.core.dao.report.ReportProDao;
import com.lwyykj.core.service.ReportProService;
import com.lwyykj.export.service.ReportListService;

@Service("reportListService")
public class ReportListServiceImpl implements ReportListService {
	@Resource
	private ReportProService reportProService;
	@Resource
	private ReportProDao reportProDao;

	@Override
	public List<ReportPro> getList(String time, String proName, Integer phId) {
//		System.out.println("这是报表" + "---" + time + "--" + proName + "--" + phId);
		List<ReportPro> reportPros = null;
		if (null != proName && "" != proName) {
			reportPros = reportProDao.selectByPhIdAndProName(phId, proName);
		}else{
			reportPros= reportProDao.selectByPhId(phId);
		}
		
//		System.out.println(reportPros.isEmpty());
		if (null != reportPros && reportPros.size() > 0) {
			for (ReportPro report : reportPros) {
				report.setTotalNum(reportProService.sumNum(report.getProId(), phId, time));
				report.setTotalFee(reportProService.sumMoney(report.getProId(), phId, time));
			}
			return reportPros;
		}
		return null;
	}

}
