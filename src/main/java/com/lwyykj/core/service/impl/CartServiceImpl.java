package com.lwyykj.core.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lwyykj.core.bean.shop.BuyerCart;
import com.lwyykj.core.bean.shop.BuyerItem;
import com.lwyykj.core.bean.shop.shopCart;
import com.lwyykj.core.bean.shop.shopCartQuery;
import com.lwyykj.core.bean.shop.shopCartQuery.Criteria;
import com.lwyykj.core.dao.shop.shopCartDao;
import com.lwyykj.core.service.CartService;

@Service("cartService")
public class CartServiceImpl implements CartService {
	@Resource
	private shopCartDao shopCartDao;

	@Override
	public int saveToCart(shopCart shopCart) {
		return shopCartDao.insertSelective(shopCart);
	}

	@Override
	public shopCart findByPhId(Integer id) {
		shopCartQuery shopCartQuery = new shopCartQuery();
		Criteria createCriteria = shopCartQuery.createCriteria();
		createCriteria.andPhIdEqualTo(id);
		List<shopCart> shopCarts = shopCartDao.selectByExample(shopCartQuery);
		if (shopCarts.size() > 0 && null != shopCarts) {
			return shopCarts.get(0);
		}
		return null;
	}

	@Override
	public int update(shopCart shopCart) {
		return shopCartDao.updateByPrimaryKeySelective(shopCart);
	}

	@Override
	public int insertToSql(BuyerCart buyerCart, Integer pid) throws Exception {
		List<BuyerItem> buyerItems = buyerCart.getItems();
		ObjectMapper om = new ObjectMapper();
		// 排除null的字段
		om.setSerializationInclusion(Include.NON_NULL);
		Integer result = 0;
		shopCart shopCart = this.findByPhId(pid);
		if (null != shopCart) {
			String carInfo = shopCart.getCarInfo();
			BuyerCart buyerCart2 = om.readValue(carInfo, BuyerCart.class);
			List<BuyerItem> items = buyerCart2.getItems();
			for (BuyerItem buyerItem : buyerItems) {
				// 判断同款
				if (items.contains(buyerItem)) {
					// 如果现在的购物项包含准备加入的购物项则合并添加数量
					for (BuyerItem it : items) {
						if (it.equals(buyerItem)) {
							// 叠加数量
							Integer r = buyerItem.getAmount() + it.getAmount();
							// 重新设置数量
							it.setAmount(r);
						}
					}
				} else {
					items.add(buyerItem);
				}
			}
			
			buyerCart2.setItems(items);
			String json1 = JSON.toJSONString(buyerCart2);
			shopCart.setCarInfo(json1);
			result = shopCartDao.updateByPrimaryKeySelective(shopCart);
		} else {
			String Jstring = JSON.toJSONString(buyerCart);
			shopCart shopCart2 = new shopCart();
			shopCart2.setAddtime((int) (new Date().getTime() / 1000));
			shopCart2.setCarInfo(Jstring);
			shopCart2.setPhId(pid);
			result = shopCartDao.insertSelective(shopCart2);
		}
		return result;
	}

}
