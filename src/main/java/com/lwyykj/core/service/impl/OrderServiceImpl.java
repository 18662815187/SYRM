package com.lwyykj.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwyykj.common.FormatDate;
import com.lwyykj.core.bean.product.Order;
import com.lwyykj.core.bean.product.OrderQuery;
import com.lwyykj.core.bean.product.OrderQuery.Criteria;
import com.lwyykj.core.bean.product.PharmacyOrder;
import com.lwyykj.core.bean.product.Sku;
import com.lwyykj.core.dao.product.OrderDao;
import com.lwyykj.core.dao.product.PharmacyOrderDao;
import com.lwyykj.core.service.OrderService;
import com.lwyykj.core.service.PhOrderService;
import com.lwyykj.core.service.SkuService;

import cn.itcast.common.page.Pagination;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {
	@Resource
	private OrderDao orderDao;
	@Resource
	private PharmacyOrderDao pharmacyOrderDao;
	@Resource
	private SkuService skuService;
	@Resource
	private PhOrderService phOrderService;

	// 分页对象已支付
	@Override
	public Pagination selectPaginationByQuery(Integer pageNo, String time, String tel, Integer style, Integer opstyle,
			HttpServletRequest request) {
		StringBuilder params = new StringBuilder();
		String timeStyle = "yy-MM-dd";
		OrderQuery orderQuery = new OrderQuery();
		orderQuery.setPageNo(Pagination.cpn(pageNo));
		orderQuery.setOrderByClause("order_id desc");
		orderQuery.setPageSize(20);
		Criteria createCriteria = orderQuery.createCriteria();
		Integer id = (Integer) request.getSession().getAttribute("pid");
		// System.out.println(id);
		createCriteria.andPhIdEqualTo(id);
		if (null != tel) {
			createCriteria.andTelLike("%" + tel + "%");
			params.append("tel=").append(tel);
		}
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], timeStyle);
			b = FormatDate.formatDate(CanTime[1], timeStyle);
			if (a == b) {
				b += 86400;
			}
//			System.out.println(a + "--------" + b);
			createCriteria.andAddtimeBetween(a, b);
		}
		if (null != style) {
			createCriteria.andStyleEqualTo(style);
			params.append("&style=").append(style);
		}
		if (null != opstyle) {
			createCriteria.andOpstyleEqualTo(opstyle);
			params.append("&opstyle=").append(opstyle);
		}
		List<Order> orders = orderDao.selectByExample(orderQuery);
		// System.out.println(orders.get(0).getPhId());
		if (null != orders && orders.size() > 0) {
			Pagination pagination = new Pagination(orderQuery.getPageNo(), orderQuery.getPageSize(),
					orderDao.countByExample(orderQuery), orders);
			// 分页展示需要传入链接和拼接条件
			String url = "/order/list.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}

	// 分页对象未支付
	@Override
	public Pagination selectPaginationByQuery1(Integer pageNo,String time, String tel, Integer style, Integer opstyle,
			HttpServletRequest request) {
		StringBuilder params = new StringBuilder();
		String timeStyle = "yy-MM-dd";
		OrderQuery orderQuery = new OrderQuery();
		orderQuery.setPageNo(Pagination.cpn(pageNo));
		orderQuery.setOrderByClause("order_id desc");
		orderQuery.setPageSize(20);
		Criteria createCriteria = orderQuery.createCriteria();
		Integer id = (Integer) request.getSession().getAttribute("pid");
		createCriteria.andPhIdEqualTo(id);
		if (null != tel) {
			createCriteria.andTelLike("%" + tel + "%");
			params.append("tel=").append(tel);
		}
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], timeStyle);
			b = FormatDate.formatDate(CanTime[1], timeStyle);
			if (a == b) {
				b += 86400;
			}
//			System.out.println(a + "--------" + b);
			createCriteria.andAddtimeBetween(a, b);
		}
		if (null != style) {
			createCriteria.andStyleEqualTo(style);
			params.append("&style=").append(style);
		}
		if (null != opstyle) {
			createCriteria.andOpstyleEqualTo(opstyle);
			params.append("&opstyle=").append(opstyle);
		}
		List<Order> orders = orderDao.selectByExample(orderQuery);
		if (null != orders && orders.size() > 0) {
			Pagination pagination = new Pagination(orderQuery.getPageNo(), orderQuery.getPageSize(),
					orderDao.countByExample(orderQuery), orders);
			// 分页展示需要传入链接和拼接条件
			String url = "/order/nonList.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}

	// 分页对象已付款未发货
	@Override
	public Pagination selectPaginationByQuery2(Integer pageNo,String time, String tel, Integer style, Integer opstyle,
			HttpServletRequest request) {
		StringBuilder params = new StringBuilder();
		String timeStyle = "yy-MM-dd";
		OrderQuery orderQuery = new OrderQuery();
		orderQuery.setPageNo(Pagination.cpn(pageNo));
		orderQuery.setOrderByClause("order_id desc");
		orderQuery.setPageSize(20);
		Criteria createCriteria = orderQuery.createCriteria();
		Integer id = (Integer) request.getSession().getAttribute("pid");
		createCriteria.andPhIdEqualTo(id);
		if (null != tel) {
			createCriteria.andTelLike("%" + tel + "%");
			params.append("tel=").append(tel);
		}
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], timeStyle);
			b = FormatDate.formatDate(CanTime[1], timeStyle);
			if (a == b) {
				b += 86400;
			}
//			System.out.println(a + "--------" + b);
			createCriteria.andAddtimeBetween(a, b);
		}
		if (null != style) {
			createCriteria.andStyleEqualTo(style);
			params.append("&style=").append(style);
		}
		if (null != opstyle) {
			createCriteria.andOpstyleEqualTo(opstyle);
			params.append("&opstyle=").append(opstyle);
		}
		List<Order> orders = orderDao.selectByExample(orderQuery);
		if (null != orders && orders.size() > 0) {
			Pagination pagination = new Pagination(orderQuery.getPageNo(), orderQuery.getPageSize(),
					orderDao.countByExample(orderQuery), orders);
			// 分页展示需要传入链接和拼接条件
			String url = "/order/notShipped.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}

	// 分页对象已完成
	@Override
	public Pagination selectPaginationByQuery3(Integer pageNo,String time, String tel, Integer style, Integer opstyle,
			HttpServletRequest request) {
		StringBuilder params = new StringBuilder();
		String timeStyle = "yy-MM-dd";
		OrderQuery orderQuery = new OrderQuery();
		orderQuery.setPageNo(Pagination.cpn(pageNo));
		orderQuery.setOrderByClause("order_id desc");
		orderQuery.setPageSize(20);
		Criteria createCriteria = orderQuery.createCriteria();
		Integer id = (Integer) request.getSession().getAttribute("pid");
		createCriteria.andPhIdEqualTo(id);
		if (null != tel) {
			createCriteria.andTelLike("%" + tel + "%");
			params.append("tel=").append(tel);
		}
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], timeStyle);
			b = FormatDate.formatDate(CanTime[1], timeStyle);
			if (a == b) {
				b += 86400;
			}
//			System.out.println(a + "--------" + b);
			createCriteria.andAddtimeBetween(a, b);
		}
		if (null != style) {
			createCriteria.andStyleEqualTo(style);
			params.append("&style=").append(style);
		}
		if (null != opstyle) {
			createCriteria.andOpstyleEqualTo(opstyle);
			params.append("&opstyle=").append(opstyle);
		}
		List<Order> orders = orderDao.selectByExample(orderQuery);
		if (null != orders && orders.size() > 0) {
			Pagination pagination = new Pagination(orderQuery.getPageNo(), orderQuery.getPageSize(),
					orderDao.countByExample(orderQuery), orders);
			// 分页展示需要传入链接和拼接条件
			String url = "/order/completed.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}

	// 通过ID查询
	@Override
	public Order findById(Integer id) {
		OrderQuery orderQuery = new OrderQuery();
		Criteria createCriteria = orderQuery.createCriteria();
		createCriteria.andOrderIdEqualTo(id);
		List<Order> orders = orderDao.selectByExample(orderQuery);
		if (null != orders && orders.size() > 0) {
			return orders.get(0);
		}
		return null;
	}

	// 发货
	@Override
	public int uodateById(Integer id, Integer pid, Integer uid) {
		// 初始状态，为执行流程,发货失败请联系管理员
		int result = 0;
		Sku sku = skuService.findByPid(pid, uid);
		PharmacyOrder phQrder = pharmacyOrderDao.selectByPrimaryKey(id);
		if (null != sku) {
			if (null != phQrder) {
				int a = sku.getStock() - phQrder.getNum();
				if (a >= 0) {
					sku.setStock(a);
					int b = skuService.updateById(sku);
					if (b > 0) {
						phQrder.setOpstyle(2);
						int c = phOrderService.updateById(phQrder);
						if (c > 0) {
							result = 1;
						} else {
							// 订单状态更新失败，请联系管理员
							result = 6;
						}
					} else {
						// 库存更新失败请联系管理员！
						result = 5;
					}

				} else {
					// 库存不足
					result = 4;
				}
			} else {
				// 订单信息获取失败
				result = 3;
			}
		} else {
			// 没有找到相应产品的库存
			result = 2;
		}
		return result;
	}

	// 分页对象全部订单
	@Override
	public Pagination selectPaginationByQuery4(Integer pageNo, String tel, String time, HttpServletRequest request) {
		StringBuilder params = new StringBuilder();
		OrderQuery orderQuery = new OrderQuery();
		orderQuery.setPageNo(Pagination.cpn(pageNo));
		orderQuery.setOrderByClause("order_id desc");
		orderQuery.setPageSize(20);
		Criteria createCriteria = orderQuery.createCriteria();
		Integer id = (Integer) request.getSession().getAttribute("pid");
		// System.out.println(id);
		createCriteria.andPhIdEqualTo(id);
		String style = "yy-MM-dd";
		if (null != tel) {
			createCriteria.andTelLike("%" + tel + "%");
			params.append("tel=").append(tel);
		}
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], style);
			b = FormatDate.formatDate(CanTime[1], style);
			if (a == b) {
				b += 86400;
			}
			createCriteria.andAddtimeBetween(a, b);
			params.append("&time=").append(time);
		}
		List<Order> orders = orderDao.selectByExample(orderQuery);
		// System.out.println(orders.get(0).getPhId());
		if (null != orders && orders.size() > 0) {
			Pagination pagination = new Pagination(orderQuery.getPageNo(), orderQuery.getPageSize(),
					orderDao.countByExample(orderQuery), orders);
			// 分页展示需要传入链接和拼接条件
			String url = "/order/AllList.do";
			pagination.pageView(url, params.toString());
			return pagination;
		}
		return null;
	}

	// 用于导出的订单列表
	public List<Order> getOrder(Integer phId, String tel, String time, Integer style, Integer opstyle) {
		OrderQuery orderQuery = new OrderQuery();
		Criteria createCriteria = orderQuery.createCriteria();
		createCriteria.andPhIdEqualTo(phId);
		String timeStyle = "yy-MM-dd";
		if (null != tel && "" != tel) {
			createCriteria.andTelLike("%" + tel + "%");
		}
		int a = 0;
		int b = 0;
		if (time != null && time != "") {
			String[] CanTime = time.split(" ~ ");
			a = FormatDate.formatDate(CanTime[0], timeStyle);
			b = FormatDate.formatDate(CanTime[1], timeStyle);
			if (a == b) {
				b += 86400;
			}
			createCriteria.andAddtimeBetween(a, b);
		}
		if (null != style) {
			createCriteria.andStyleEqualTo(style);
		}
		if (null != opstyle) {
			createCriteria.andOpstyleEqualTo(opstyle);
		}
		List<Order> orders = orderDao.selectByExample(orderQuery);
		return orders;
	}
}
