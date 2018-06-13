package com.lwyykj.core.controller;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lwyykj.core.bean.product.Order;
import com.lwyykj.core.service.OrderService;
import cn.itcast.common.page.Pagination;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Resource
	private OrderService orderService;
	
	
	// 全部订单列表
		@RequestMapping("/AllList.do")
		public String AllList(String time,String tel, Integer pageNo, Integer opstyle, Model model,
				HttpServletRequest request) {
//			System.out.println(request.getSession().getAttribute("pid"));
			Pagination pagination = orderService.selectPaginationByQuery4(pageNo, tel,time, request);
			model.addAttribute("pagination", pagination);
			model.addAttribute("tel", tel);
			model.addAttribute("time", time);
			return "/order/AllList";
		}

	// 已支付列表
	@RequestMapping("/list.do")
	public String list(String time,String tel, Integer pageNo, Integer style, Integer opstyle, Model model,
			HttpServletRequest request) {
//		System.out.println(request.getSession().getAttribute("pid"));
		Pagination pagination = orderService.selectPaginationByQuery(pageNo,time,tel, style, opstyle, request);
		model.addAttribute("pagination", pagination);
		model.addAttribute("tel", tel);
		model.addAttribute("time", time);
		return "/order/list";
	}

	// 未支付列表
	@RequestMapping("/nonList.do")
	public String nonList(String tel,String time, Integer pageNo, Integer style, Integer opstyle, Model model,
			HttpServletRequest request) {
		Pagination pagination = orderService.selectPaginationByQuery1(pageNo,time, tel, style, opstyle, request);
		model.addAttribute("pagination", pagination);
		model.addAttribute("tel", tel);
		model.addAttribute("time", time);
		return "/order/non_payment";
	}

	// 未发货列表
	@RequestMapping("/notShipped.do")
	public String nonShipped(String tel,String time, Integer pageNo, Integer style, Integer opstyle, Model model,
			HttpServletRequest request) {
		Pagination pagination = orderService.selectPaginationByQuery2(pageNo,time, tel, style, opstyle, request);
		model.addAttribute("pagination", pagination);
		model.addAttribute("tel", tel);
		model.addAttribute("time", time);
		return "/order/not_shipped";
	}

	// 已完成
	@RequestMapping("/completed.do")
	public String completed(String tel,String time, Integer pageNo, Integer style, Integer opstyle, Model model,
			HttpServletRequest request) {
		Pagination pagination = orderService.selectPaginationByQuery3(pageNo,time, tel, style, opstyle, request);
		model.addAttribute("pagination", pagination);
		model.addAttribute("tel", tel);
		model.addAttribute("time", time);
		return "/order/completed";
	}

	// 页面左侧
	@RequestMapping("/left.do")
	public String left() {
		return "/frame/order_left";
	}

	@RequestMapping("/list1.do")
	@ResponseBody
	public Object list1(String tel,String time, Integer pageNo, Integer style, Integer opstyle, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		Pagination pagination = orderService.selectPaginationByQuery(pageNo,time,tel, style, opstyle, request);
		map.put("pagination", pagination);
		return map;
	}

	// 详细页
	@RequestMapping("/view.do")
	public String toView(Integer id, Model model) {
		// System.out.println(id);
		Order order = orderService.findById(id);
		model.addAttribute("order", order);
		return "/order/view";
	}

	// 发货
	@RequestMapping("/deliver.do")
	@ResponseBody
	public Object Deliver(Integer id, Integer pid, HttpServletRequest request) {
		Integer uid = (Integer) request.getSession().getAttribute("pid");
		Map<String, Object> map = new HashMap<>();
		int result = orderService.uodateById(id, pid, uid);
		switch (result) {
		case 1:
			//发货成功
			map.put("message", 1);
			break;
		case 2:
			//没有找到该产品的库存信息
			map.put("message", 2);
			break;
		case 3:
			//订单信息获取失败
			map.put("message", 3);
			break;
		case 4:
			//库存不足，请检查库存
			map.put("message", 4);
			break;
		case 5:
			//库存更新失败，请联系管理员
			map.put("message", 5);
			break;
		case 6:
			//订单状态更新失败，请联系管理员
			map.put("message", 6);
			break;
		case 0:
			//网络请求失败，请联系管理员
			map.put("message", 0);
			break;
		default:
			break;
		}
		return map;
	}
}
