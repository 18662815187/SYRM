package com.lwyykj.core.controller;

import java.math.BigDecimal;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lwyykj.core.service.ReportProService;
import com.lwyykj.core.service.ReportService;
import cn.itcast.common.page.Pagination;


@Controller
@RequestMapping("/report")
public class ReportController {
	public static final String FILE_SEPARATOR = System.getProperties()
			.getProperty("file.separator");
	@Resource
	private ReportProService reportProService;
	@Resource
	private ReportService reportService;

	// 报表中心
	@RequestMapping("/list.do")
	public String toList(Integer pageNo, Model model, String time, String proName, HttpServletRequest request) {
		Integer phId = (Integer) request.getSession().getAttribute("pid");

		Pagination pagination = reportService.selectPaginationByQuery(pageNo, proName, time, request);

		if (null != pagination) {
			model.addAttribute("pagination", pagination);
		}

		BigDecimal sumAllMoney = reportProService.sumAllMoney(phId, time);
		model.addAttribute("totalMoney", sumAllMoney);
		model.addAttribute("time", time);
		model.addAttribute("proName", proName);
		return "/report/list";
	}
}
