package com.lwyykj.core.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lwyykj.core.bean.product.Order;

import cn.itcast.common.page.Pagination;

/**
 * 订单接口
 * 
 * @author john
 *
 */
public interface OrderService {
	//分页对象已付款
	public Pagination selectPaginationByQuery(Integer pageNo,String time,String tel,Integer style,Integer opstyle,HttpServletRequest request);
	//根据ID查询对象
	public Order findById(Integer id);
	//未支付
	public Pagination selectPaginationByQuery1(Integer pageNo,String time, String tel,Integer style,Integer opstyle,HttpServletRequest request);
	//未发货
	public Pagination selectPaginationByQuery2(Integer pageNo,String time, String tel, Integer style, Integer opstyle,HttpServletRequest request);
	//未完成
	public Pagination selectPaginationByQuery3(Integer pageNo,String time, String tel, Integer style, Integer opstyle,HttpServletRequest request);
	//发货
	public int uodateById(Integer id,Integer pid,Integer uid);
	//全部订单
	public Pagination selectPaginationByQuery4(Integer pageNo, String tel,String time,HttpServletRequest request);
	//用于导出的订单列表
	public List<Order> getOrder(Integer phId,String tel,String time,Integer style,Integer opstyle);
}
