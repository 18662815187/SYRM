package com.lwyykj.core.controller;

import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lwyykj.export.service.ExportService;

@Controller
public class ExportController {
	/**
	 * 导出工具类
	 */
	@Resource
	private ExportService exportService;

	@RequestMapping("/export.do")
	public @ResponseBody String export(HttpServletResponse response, HttpServletRequest request, String time,
			String proName) {
		response.setContentType("application/binary;charset=UTF-8");
		Integer phId = (Integer) request.getSession().getAttribute("pid");
		try {
			ServletOutputStream out = response.getOutputStream();
			String fileName = new String(("syrm-report" + new Date().getTime()).getBytes(), "UTF-8");
			response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
			String[] titles = { "产品编号", "产品名称", "品牌名称", "规格", "厂家", "单价", "销售总数", "销售总额" };
			exportService.export(titles, out, time, proName, phId);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "导出信息失败";
		}
	}

	@RequestMapping("/exportOrder.do")
	public @ResponseBody String export(HttpServletRequest request, HttpServletResponse response, String time,
			String tel, Integer style, Integer opstyle) {
		response.setContentType("application/binary;charset=UTF-8");
		Integer phId = (Integer) request.getSession().getAttribute("pid");
//		System.out.println(phId+"----"+style+"----"+opstyle+"----"+time);
		try {
			ServletOutputStream out = response.getOutputStream();
			String fileName = new String(("syrm-order" + new Date().getTime()).getBytes(), "UTF-8");
			response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
			String[] titles = { "订单ID", "订单号", "产品名称", "品牌名称", "规格", "厂家", "单价", "数量", "金额累计", "购买人姓名", "购买人手机号",
					"订单状态", "下单时间" };
			exportService.export1(titles, out, time, tel, phId, style, opstyle);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "导出信息失败";
		}
	}
}
