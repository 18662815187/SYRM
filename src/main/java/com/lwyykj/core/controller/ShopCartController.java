package com.lwyykj.core.controller;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lwyykj.common.Constants;
import com.lwyykj.core.bean.product.ProductStandard;
import com.lwyykj.core.bean.shop.BuyerCart;
import com.lwyykj.core.bean.shop.BuyerItem;
import com.lwyykj.core.bean.shop.OrderVerfiy;
import com.lwyykj.core.bean.shop.Orders;
import com.lwyykj.core.bean.shop.OrdersPro;
import com.lwyykj.core.bean.shop.ProCart;
import com.lwyykj.core.bean.shop.ProShop;
import com.lwyykj.core.bean.shop.shopCart;
import com.lwyykj.core.dao.product.FactoryDao;
import com.lwyykj.core.dao.product.ProductStandardDao;
import com.lwyykj.core.dao.shop.OrdersDao;
import com.lwyykj.core.dao.shop.OrdersProDao;
import com.lwyykj.core.dao.shop.shopCartDao;
import com.lwyykj.core.service.CartService;
import com.lwyykj.core.service.ProductService;
import com.lwyykj.core.service.SupBrandService;
import cn.itcast.common.page.Pagination;

/**
 * 
 * @author john
 *
 */

@Controller
@RequestMapping("/shopping")
public class ShopCartController {
	@Resource
	private SupBrandService supBrandService;
	@Resource
	private CartService cartService;
	@Resource
	private ProductService productService;
	@Resource
	private FactoryDao factoryDao;
	@Resource
	private ProductStandardDao productDao;
	@Resource
	private shopCartDao scDao;
	@Resource
	private OrdersDao ordersDao;
	@Resource
	private OrdersProDao ordersProDao;
	// 去购物车页面
	@RequestMapping("/toCart")
	@CrossOrigin(origins = "*", maxAge = 3600)
	// @ResponseBody
	public String toCart(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// Map<String, Object> map1 = new HashMap<>();
		ObjectMapper om = new ObjectMapper();
		// 排除null的字段
		om.setSerializationInclusion(Include.NON_NULL);
		// 声明购物车
		BuyerCart buyerCart = null;
		// 1.从Request中取Cookies,遍历Cookie 取出之前的购物车
		Cookie[] cookies = request.getCookies();
		if (null != cookies && cookies.length > 0) {
			// 遍历Cookie 取出之前的购物车
			for (Cookie cookie : cookies) {
				// 2.判断cookie中有没有购物车,如果购物车的name和cookie中name一样则表示有购物车
				if (Constants.BUYER_CART.equals(cookie.getName())) {
					// 转回对象
					buyerCart = om.readValue(cookie.getValue(), BuyerCart.class);
					// 节省性能找到直接结束
					break;
				}
			}
		}
		// 用户是否登录
		String username = (String) request.getSession().getAttribute(Constants.USER_NAME);
		Integer pid = (Integer) request.getSession().getAttribute("pid");
		List<ProShop> proShops = new ArrayList<>();
		// 判断是否登录
		if (null != username) {
			// 有 把购物车内商品添加到数据库的购物车中，
			if (null != buyerCart) {
				cartService.insertToSql(buyerCart, pid);
				// 清理cookie
				Cookie cookie = new Cookie(Constants.BUYER_CART, null);
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			}

			// 从redis中取出购物车service层，这时候的数据是cookie和redis的数据总和
			shopCart shopCart = cartService.findByPhId(18);
			buyerCart = om.readValue(shopCart.getCarInfo(), BuyerCart.class);
		}
		// 购物车内有,把购物车内需要的数据装满用于回显
		Map<Integer, List<BuyerItem>> map = new HashMap<>();
		if (null != buyerCart) {
			List<BuyerItem> items = buyerCart.getItems();
			if(null!=items&&items.size()>0){
				for (BuyerItem buyerItem : items) {
					List<BuyerItem> tempList = map.get(buyerItem.getFac_id());
					if (tempList == null) {
						tempList = new ArrayList<>();
						tempList.add(buyerItem);
						map.put(buyerItem.getFac_id(), tempList);
					} else {
						tempList.add(buyerItem);
					}
				}
				List<List<BuyerItem>> lists = new ArrayList<>();
				for (Object key : map.keySet()) {
					lists.add(map.get(key));
				}

				for (List<BuyerItem> buyerItem : lists) {
					for (BuyerItem buyerItem2 : buyerItem) {
						buyerItem2.setProductStandard(productDao.selectByPrimaryKey(buyerItem2.getProCart().getPro_id()));
					}
					ProShop proShop = new ProShop();
					proShop.setBuyerItems(buyerItem);
					proShop.setFac_id(buyerItem.get(0).getFac_id());
					proShop.setFac_name((factoryDao.selectByPrimaryKey(buyerItem.get(0).getFac_id())).getName());
					proShops.add(proShop);
				}
				// 回显购物车内容
				model.addAttribute("buyerCart", proShops);
			}
			// map1.put("cart", "1");
		}
		// map1.put("cart", proShops);
		// 跳转到购物车页面
		return "/shop/shop";
		// return map1;
	}

	// 添加进购物车
	@RequestMapping("/addToCart")
	@CrossOrigin(origins = "*", maxAge = 3600)
	public String addCart(Integer pro_id, Integer amount, Model model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// @RequestBody、@ResponseBody JSON与对象互转,声明ObjectMapper对象
		ObjectMapper om = new ObjectMapper();
		// 排除null的字段
		om.setSerializationInclusion(Include.NON_NULL);
		// 声明购物车
		BuyerCart buyerCart = null;
		// 1.从Request中取Cookies,遍历Cookie 取出之前的购物车
		Cookie[] cookies = request.getCookies();
		if (null != cookies && cookies.length > 0) {
			// 遍历Cookie 取出之前的购物车
			for (Cookie cookie : cookies) {
				// 2.判断cookie中有没有购物车,如果购物车的name和cookie中name一样则表示有购物车
				if (Constants.BUYER_CART.equals(cookie.getName())) {
					// 转回对象
					buyerCart = om.readValue(cookie.getValue(), BuyerCart.class);
					// 节省性能找到直接结束
					break;
				}
			}
		}
		// 判断购物车是否为null
		if (null == buyerCart) {
			buyerCart = new BuyerCart();
		}
		if (null != pro_id && null != amount) {
			// 追加当前款商品
			ProCart proCart = new ProCart();
			proCart.setPro_id(pro_id);
			// 设置价格
			proCart.setPrice(new BigDecimal(108));
			BuyerItem buyerItem = new BuyerItem();
			buyerItem.setProCart(proCart);
			// Amount数量
			buyerItem.setAmount(amount);
			// 设置商品卖家ID
			int fid = productService.findByPid(pro_id);
			buyerItem.setFac_id(fid);
			// 追加商品到购物车
			buyerCart.addItem(buyerItem);
		}

		// 用户是否登录
		String username = (String) request.getSession().getAttribute(Constants.USER_NAME);
		Integer ph_id = (Integer) request.getSession().getAttribute("pid");
		// 判断是否登录
		if (null != username) {
			cartService.insertToSql(buyerCart, ph_id);
			// 清理cookie
			Cookie cookie = new Cookie(Constants.BUYER_CART, null);
			cookie.setMaxAge(0);
			cookie.setPath("/");
			response.addCookie(cookie);
		} else {
			// 如果没有创建购物车
			// 创建cookie
			Writer w = new StringWriter();
			om.writeValue(w, buyerCart);
			Cookie cookie = new Cookie(Constants.BUYER_CART, w.toString());
			// 设置时间,开发期间设置为1天,以秒计算
			cookie.setMaxAge(60 * 60 * 24);
			// 设置路径
			cookie.setPath("/");
			// 跨域
			// cookie.setDomain("www.mryisheng.com");
			// 保存cookie写回浏览器
			response.addCookie(cookie);
		}
		// 跳转到购物车页面
		return "redirect:/shopping/toCart";
	}

	// 提交购物车订单
	@RequestMapping("/applyCart")
	public String apply() {
		return null;
	}

	// 去产品页
	@RequestMapping("/toProList")
	public String toProList(Integer id, String name, Integer pageNo, Model model) {
		Pagination pagination = supBrandService.findBySid(id, pageNo, name);
		if (null != pagination) {
			model.addAttribute("pagination", pagination);
		}
		model.addAttribute("name", name);
		return "/product/shopList";
	}

	// 去购物车页面
	@RequestMapping("/toCart1")
	@CrossOrigin(origins = "*", maxAge = 3600)
	@ResponseBody
	public Object toCart1(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> map1 = new HashMap<>();
		ObjectMapper om = new ObjectMapper();
		// 排除null的字段
		om.setSerializationInclusion(Include.NON_NULL);
		// 声明购物车
		BuyerCart buyerCart = null;
		// 1.从Request中取Cookies,遍历Cookie 取出之前的购物车
		Cookie[] cookies = request.getCookies();
		if (null != cookies && cookies.length > 0) {
			// 遍历Cookie 取出之前的购物车
			for (Cookie cookie : cookies) {
				// 2.判断cookie中有没有购物车,如果购物车的name和cookie中name一样则表示有购物车
				if (Constants.BUYER_CART.equals(cookie.getName())) {
					// 转回对象
					buyerCart = om.readValue(cookie.getValue(), BuyerCart.class);
					// 节省性能找到直接结束
					break;
				}
			}
		}
		// 用户是否登录
		String username = (String) request.getSession().getAttribute(Constants.USER_NAME);
		Integer pid = (Integer) request.getSession().getAttribute("pid");
		// 判断是否登录
		if (null != username) {
			// 有 把购物车内商品添加到数据库的购物车中，
			if (null != buyerCart) {
				cartService.insertToSql(buyerCart, pid);
				// 清理cookie
				Cookie cookie = new Cookie(Constants.BUYER_CART, null);
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
			}

			// 从redis中取出购物车service层，这时候的数据是cookie和redis的数据总和
			shopCart shopCart = cartService.findByPhId(pid);
			buyerCart = om.readValue(shopCart.getCarInfo(), BuyerCart.class);
		}
		// 购物车内有,把购物车内需要的数据装满用于回显
		Map<Integer, List<BuyerItem>> map = new HashMap<>();
		if (null != buyerCart) {
			List<BuyerItem> items = buyerCart.getItems();
			if(null!=items&&items.size()>0){
				for (BuyerItem buyerItem : items) {
					List<BuyerItem> tempList = map.get(buyerItem.getFac_id());
					if (tempList == null) {
						tempList = new ArrayList<>();
						tempList.add(buyerItem);
						map.put(buyerItem.getFac_id(), tempList);
					} else {
						tempList.add(buyerItem);
					}
				}
				List<List<BuyerItem>> lists = new ArrayList<>();
				for (Object key : map.keySet()) {
					lists.add(map.get(key));
				}
				map1.put("cart", lists);
			}else{
				return null;
			}
			
			
//			for (List<BuyerItem> buyerItem : lists) {
//				for (BuyerItem buyerItem2 : buyerItem) {
//					System.out.println("这是里面的" + "-----" + buyerItem2.getProCart().getPro_id());
//				}
//			}
			// 回显购物车内容
			// model.addAttribute("buyerCart", lists);
			
			// map1.put("cart", "1");
		}

		// 跳转到购物车页面
		// return "/shop/shop";
		return map1;
	}

	// 删除购物车内商品
	@RequestMapping("/delByIds")
	public Object delByIds(Integer[] ids, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		// 排除null的字段
		om.setSerializationInclusion(Include.NON_NULL);
		Integer pid = (Integer) request.getSession().getAttribute("pid");
		String username = (String) request.getSession().getAttribute(Constants.USER_NAME);
		if (username != null) {
			shopCart shopCart = cartService.findByPhId(pid);
			String carInfo = shopCart.getCarInfo();
			BuyerCart bCart = om.readValue(carInfo, BuyerCart.class);
			List<BuyerItem> items = bCart.getItems();
			for (int i = 0; i < items.size(); i++) {
				for (Integer id : ids) {
					if (items.get(i).getProCart().getPro_id() == id) {
						items.remove(i);
					}
				}
			}
			bCart.setItems(items);
			shopCart.setCarInfo(JSONObject.toJSONString(bCart));
			scDao.updateByPrimaryKey(shopCart);
		}
		return null;
	}

	// 进入确认订单页
	@RequestMapping("/verfiyOrder")
	// @ResponseBody
	public String verfiyOrder(Integer[] ids, Model model, HttpServletRequest req, String returnUrl)
			throws JsonParseException, JsonMappingException, IOException {
		// Map<String, Object> map1 = new HashMap<>();
		ObjectMapper om = new ObjectMapper();
		// 排除null的字段
		om.setSerializationInclusion(Include.NON_NULL);
		Integer pid = (Integer) req.getSession().getAttribute("pid");
		shopCart shopCart = cartService.findByPhId(pid);
		String carInfo = shopCart.getCarInfo();
		BuyerCart bCart = om.readValue(carInfo, BuyerCart.class);
		List<BuyerItem> items = bCart.getItems();
		List<ProductStandard> productStandards = new ArrayList<>();
		for (Integer id : ids) {
			ProductStandard pro = productService.findById(id);
			for (BuyerItem it : items) {
				if (id.equals(it.getProCart().getPro_id())) {
					pro.setNum(it.getAmount());
				}
			}
			productStandards.add(pro);
		}
		Map<Integer, List<ProductStandard>> map = new HashMap<>();
		String username = (String) req.getSession().getAttribute(Constants.USER_NAME);
		if (null != username) {
			for (ProductStandard productStandard : productStandards) {
				List<ProductStandard> pros = map.get(productStandard.getFactoryId());
				if (pros == null) {
					pros = new ArrayList<>();
					pros.add(productStandard);
					map.put(productStandard.getFactoryId(), pros);
				} else {
					pros.add(productStandard);
				}
			}

			List<List<ProductStandard>> lists = new ArrayList<>();
			List<OrderVerfiy> orderVerfiys = new ArrayList<>();
			for (Object key : map.keySet()) {
				lists.add(map.get(key));
			}
			for (List<ProductStandard> p : lists) {
				OrderVerfiy orderVerfiy = new OrderVerfiy();
				orderVerfiy.setFac_id(p.get(0).getFactoryId());
				orderVerfiy.setProductStandards(p);
				orderVerfiy.setFac_name((factoryDao.selectByPrimaryKey(p.get(0).getFactoryId()).getName()));
				orderVerfiys.add(orderVerfiy);
			}
			// map1.put("verfiyOrder", orderVerfiys);
			// map1.put("proIds",ids);
			// for (OrderVerfiy orderVerfiy : orderVerfiys) {
			// System.out.println(orderVerfiy.getFac_name());
			// List<ProductStandard> productStandards2 =
			// orderVerfiy.getProductStandards();
			// for (ProductStandard productStandard : productStandards2) {
			// System.out.println(productStandard.getProductName());
			// }
			// }
			model.addAttribute("proIds", ids);
			model.addAttribute("verfiyOrder", orderVerfiys);
			return "/shop/firm_order";
			// return map1;
		} else {
			model.addAttribute("returnUrl", returnUrl);
			return "redirect:login";

		}

	}

	// 提交订单
	@RequestMapping("/applyOrder")
	public String applyOrder(Integer[] ids, HttpServletRequest request,Model model)
			throws JsonParseException, JsonMappingException, IOException {
//		System.out.println(ids.length+"这是传进来数组的长度");
		Integer pid = (Integer) request.getSession().getAttribute("pid");
		shopCart shopCart = cartService.findByPhId(pid);
		String carInfo = shopCart.getCarInfo();
		ObjectMapper om = new ObjectMapper();
		// 排除null的字段
		om.setSerializationInclusion(Include.NON_NULL);
		BuyerCart bCart = om.readValue(carInfo, BuyerCart.class);
		List<BuyerItem> items = bCart.getItems();
		List<ProductStandard> productStandards = new ArrayList<>();
		for (Integer id : ids) {
//			System.out.println(id+"这是传进来的ID");
			ProductStandard pro = productService.findById(id);
			for (int i = 0; i < items.size(); i++) {
				if (items.get(i).getProCart().getPro_id() .equals(id) ) {
					pro.setNum(items.get(i).getAmount());
					items.remove(i);
				}
			}
			productStandards.add(pro);
		}
		bCart.setItems(items);
		shopCart.setCarInfo(JSONObject.toJSONString(bCart));
		scDao.updateByPrimaryKey(shopCart);
		Map<Integer, List<ProductStandard>> map = new HashMap<>();
		for (ProductStandard productStandard : productStandards) {
			List<ProductStandard> list = map.get(productStandard.getFactoryId());
			if (null == list) {
				list = new ArrayList<>();
				list.add(productStandard);
				map.put(productStandard.getFactoryId(), list);
			} else {
				list.add(productStandard);
			}
		}
		List<List<ProductStandard>> lists = new ArrayList<>();
		for (Object key : map.keySet()) {
			lists.add(map.get(key));
		}
		List<Integer> oids = new ArrayList<>();
		BigDecimal b = new BigDecimal(0);
//		System.out.println(lists.size());
		for (List<ProductStandard> list : lists) {
			BigDecimal c = new BigDecimal(0);
			Orders orders = new Orders();
			orders.setAddtime((int) (new Date().getTime() / 1000));
			orders.setUid(pid);
			orders.setCreateStyle(0);
			orders.setIsDel(false);
			orders.setOrderNum(Constants.getOrderNum());
			orders.setStatus(0);
			orders.setType(0);
			ordersDao.insertSelective(orders);
			int a = orders.getId();
//			System.out.println(d);
			oids.add(a);
			for (ProductStandard pro : list) {
				OrdersPro ordersPro = new OrdersPro();
				ordersPro.setMoney(pro.getGuidingPrice());
				ordersPro.setNum(pro.getNum());
				ordersPro.setOid(a);
				ordersPro.setOpstyle(0);
				ordersPro.setPid(pro.getId());
				ordersPro.setRefundState(0);
				ordersProDao.insertSelective(ordersPro);
				c = c.add(pro.getGuidingPrice().multiply(new BigDecimal(pro.getNum())));
			}
			b = b.add(c);
		}
		model.addAttribute("oids", oids);
//		System.out.println(oids.get(1));
//		model.addAttribute("totalFee", b);
//		System.out.println(b);
		return "/shop/payment";
	}

}
