package com.lwyykj.export.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import com.lwyykj.core.bean.product.Order;
import com.lwyykj.core.bean.report.ReportPro;
import com.lwyykj.core.service.OrderService;
import com.lwyykj.export.service.ExportService;
import com.lwyykj.export.service.ReportListService;

@Service("exportService")
public class ExportServiceImpl implements ExportService {
	// @Resource
	// private ReportService reportService;
	@Resource
	private ReportListService reportListService;
	@Resource
	private OrderService orderService;

	@Override
	public void export(String[] titles, ServletOutputStream out, String time, String proName, Integer phId) {
		try {
			// 第一步，创建一个workbook，对应一个Excel文件
			HSSFWorkbook workbook = new HSSFWorkbook();
			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			HSSFSheet hssfSheet = workbook.createSheet("sheet1");
			// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
			HSSFRow hssfRow = hssfSheet.createRow(0);
			// 第四步，创建单元格，并设置值表头 设置表头居中
			HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
			// 居中样式
			hssfCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			HSSFCell hssfCell = null;
			for (int i = 0; i < titles.length; i++) {
				hssfCell = hssfRow.createCell(i);// 列索引从0开始
				hssfCell.setCellValue(titles[i]);// 列名1
				hssfCell.setCellStyle(hssfCellStyle);// 列居中显示
			}
			// 第五步，写入实体数据
			// System.out.println("这是导出"+time+"--"+proName+"--"+phId);
			List<ReportPro> reports = reportListService.getList(time, proName, phId);
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if (reports != null && !reports.isEmpty()) {
				for (int i = 0; i < reports.size(); i++) {
					hssfRow = hssfSheet.createRow(i + 1);
					ReportPro report = reports.get(i);

					// 第六步，创建单元格，并设置值
					// 产品标号
					int reportId = 0;
					if (report.getProId() != 0) {
						reportId = report.getProId();
					}
					hssfRow.createCell(0).setCellValue(reportId);
					// //品牌编号
					// int skuId = 0;
					// if (report.getSkuId() != 0) {
					// reportId = report.getSkuId();
					// }
					// hssfRow.createCell(1).setCellValue(skuId);
					// 品名
					String pro_name = "";
					if (report.getProName() != null) {
						pro_name = report.getProName();
					}
					hssfRow.createCell(1).setCellValue(pro_name);
					// 品牌名
					String brand_name = "";
					if (report.getBrandName() != null) {
						brand_name = report.getBrandName();
					}
					hssfRow.createCell(2).setCellValue(brand_name);
					// 规格
					String spec = "";
					if (report.getSpec() != null) {
						spec = report.getSpec();
					}
					hssfRow.createCell(3).setCellValue(spec);
					// 厂家名
					String fac_name = "";
					if (report.getFacName() != null) {
						fac_name = report.getFacName();
					}
					hssfRow.createCell(4).setCellValue(fac_name);
					// 单价
					String pirce = "";
					if (report.getPrice() != null) {
						pirce = String.valueOf(report.getPrice());
					}
					hssfRow.createCell(5).setCellValue(pirce);
					// 总计数量
					int totalNum = 0;
					if (report.getTotalNum() > 0) {
						totalNum = report.getTotalNum();
					}
					hssfRow.createCell(6).setCellValue(totalNum);
					// 总金额
					String totalFee = "";
					if (report.getTotalFee() != null) {
						totalFee = String.valueOf(report.getTotalFee());
					}
					hssfRow.createCell(7).setCellValue(totalFee);
					// //药房ID
					// int ph_id = 0;
					// if (report.getPhId() != 0) {
					// ph_id = report.getPhId();
					// }
					// hssfRow.createCell(4).setCellValue(ph_id);
				}
			}

			// 第七步，将文件输出到客户端浏览器
			try {
				workbook.write(out);
				out.flush();
				out.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception("导出信息失败！");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void export1(String[] titles, ServletOutputStream out, String time, String tel, Integer phId, Integer style,
			Integer opstyle) {
		try {
			// 第一步，创建一个workbook，对应一个Excel文件
			HSSFWorkbook workbook = new HSSFWorkbook();
			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			HSSFSheet hssfSheet = workbook.createSheet("sheet1");
			// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
			HSSFRow hssfRow = hssfSheet.createRow(0);
			// 第四步，创建单元格，并设置值表头 设置表头居中
			HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
			// 居中样式
			hssfCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			HSSFCell hssfCell = null;
			for (int i = 0; i < titles.length; i++) {
				hssfCell = hssfRow.createCell(i);// 列索引从0开始
				hssfCell.setCellValue(titles[i]);// 列名1
				hssfCell.setCellStyle(hssfCellStyle);// 列居中显示
			}
			// 第五步，写入实体数据
//			 System.out.println("这是导出"+time+"--"+style+"--"+phId+"---"+opstyle);
			List<Order> orders = orderService.getOrder(phId, tel, time, style, opstyle);
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if (orders != null && !orders.isEmpty()) {
				for (int i = 0; i < orders.size(); i++) {
					hssfRow = hssfSheet.createRow(i + 1);
					Order order = orders.get(i);

					// 第六步，创建单元格，并设置值
					// 订单编号
					int orderId = 0;
					if (order.getOrderId() != 0) {
						orderId = order.getOrderId();
					}
					hssfRow.createCell(0).setCellValue(orderId);
					// 订单号
					String orderNum = "";
					if (order.getOrderNum() != null) {
						orderNum = order.getOrderNum();
					}
					hssfRow.createCell(1).setCellValue(orderNum);
					// 产品名称
					String pro_name = "";
					if (order.getProductName() != null) {
						pro_name = order.getProductName();
					}
					hssfRow.createCell(2).setCellValue(pro_name);
					// 品牌名称
					String brand_name = "";
					if (order.getBrandname() != null) {
						brand_name = order.getBrandname();
					}
					hssfRow.createCell(3).setCellValue(brand_name);
					// 规格
					String spec = "";
					if (order.getSpec() != null) {
						spec = order.getSpec();
					}
					hssfRow.createCell(4).setCellValue(spec);
					// 厂家名
					String fac_name = "";
					if (order.getFactoryname() != null) {
						fac_name = order.getFactoryname();
					}
					hssfRow.createCell(5).setCellValue(fac_name);
					// 单价
					String pirce = "";
					if (order.getPrice() != null) {
						pirce = String.valueOf(order.getPrice());
					}
					hssfRow.createCell(6).setCellValue(pirce);
					// 数量
					int totalNum = 0;
					if (order.getNum() != null) {
						totalNum = order.getNum();
					}
					hssfRow.createCell(7).setCellValue(totalNum);
					// 总金额
					String totalFee = "";
					if (order.getFee() != null) {
						totalFee = String.valueOf(order.getFee());
					}
					hssfRow.createCell(8).setCellValue(totalFee);
					// 购买人姓名
					String userName = "";
					if (order.getBuyername() != null) {
						userName = order.getBuyername();
					}
					hssfRow.createCell(9).setCellValue(userName);
					// 购买人手机号
					String phone = "";
					if (order.getTel() != null) {
						phone = order.getTel();
					}
					hssfRow.createCell(10).setCellValue(phone);
					// 订单状态
					String payStyle = "";
					if (order.getOpstyle() == 2) {
						payStyle = "订单已完成";
					} else if (order.getStyle() == 0 && order.getOpstyle() == 0) {
						payStyle = "未付款未发货";
					} else if (order.getStyle() == 1 && order.getOpstyle() == 0) {
						payStyle = "已付款未发货";
					} else {
						payStyle = "异常订单";
					}
					hssfRow.createCell(11).setCellValue(payStyle);
					// 下单时间
					String addTime = "";
					if (order.getAddtime() != null) {
						String vv = "" + order.getAddtime();
						try {
							long adTime = Long.valueOf(vv.trim());
							Calendar c = Calendar.getInstance();
							// java需要乘以1000
							c.setTimeInMillis(adTime * 1000);
							SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							addTime = dateformat.format(c.getTime());
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					hssfRow.createCell(12).setCellValue(addTime);
				}
			}

			// 第七步，将文件输出到客户端浏览器
			try {
				workbook.write(out);
				out.flush();
				out.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				throw new Exception("导出信息失败！");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
