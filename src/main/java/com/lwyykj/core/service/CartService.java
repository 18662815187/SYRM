package com.lwyykj.core.service;

import org.springframework.stereotype.Service;

import com.lwyykj.core.bean.shop.BuyerCart;
import com.lwyykj.core.bean.shop.shopCart;

/**
 * 购物车服务
 * 
 * @author john
 *
 */
@Service("cartService")
public interface CartService {
	// 保存购物车到数据库
	public int saveToCart(shopCart shopCart);

	// 查询购物车
	public shopCart findByPhId(Integer id);

	// 更新购物车
	public int update(shopCart shopCart);
	//插入购物车
	public int insertToSql(BuyerCart buyerCart,Integer pid) throws Exception;
}
