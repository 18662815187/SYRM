package com.lwyykj.core.bean.shop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 购物车
 * 
 * @author john
 *
 */
public class BuyerCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 1.商品结果集List<BuyerItem>,初始化arrayList用于防止购物车为空值时添加到购物车报空指针
	private List<BuyerItem> items = new ArrayList<BuyerItem>();

	// 添加购物项到购物车
	public void addItem(BuyerItem item) {
		// Map<Integer, List<BuyerItem>> itemList = new HashMap<>();
		// 判断同款
		if (items.contains(item)) {
			// 如果现在的购物项包含准备加入的购物项则合并添加数量
			for (BuyerItem it : items) {
				if (it.equals(item)) {
					// 叠加数量
					Integer r = item.getAmount() + it.getAmount();
					// 重新设置数量
					it.setAmount(r);
				}
			}
		} else {
			items.add(item);
			// itemList.put(item.getFac_id(), items);
		}

	}

	public List<BuyerItem> getItems() {
		return items;
	}

	public void setItems(List<BuyerItem> items) {
		this.items = items;
	}

	// 2.小计 (数量、金额、运费、总计)
	// 商品数量
	// 这个注解代表JSON和javaBean转换时忽略
	@JsonIgnore
	public Integer getProductAmount() {
		Integer result = 0;
		// 计算过程
		for (BuyerItem buyerItem : items) {
			result += buyerItem.getAmount();
		}
		return result;
	}

	// 商品金额
	// 这个注解代表JSON和javaBean转换时忽略
	@JsonIgnore
	public BigDecimal getProductPrice() {
		BigDecimal result = new BigDecimal(0);
		// 计算过程
		for (BuyerItem buyerItem : items) {
			// result +=buyerItem.getAmount() * buyerItem.getSku().getPrice() ;
			// result = (new
			// BigDecimal(buyerItem.getAmount())).multiply((buyerItem.getSku().getPrice()));
			result = result.add(new BigDecimal(buyerItem.getAmount()).multiply(buyerItem.getProCart().getPrice()));

			// result=new BigDecimal(1.5);
		}
		return result;
	}

	// 运费
	// 这个注解代表JSON和javaBean转换时忽略
	@JsonIgnore
	public BigDecimal getFee() {
		BigDecimal result = new BigDecimal(0);
		if ((getProductPrice().compareTo(new BigDecimal(79))) == (-1)) {
			// 总价低于79则默认8块钱运费
			result = new BigDecimal(8);
		}
		return result;
	}

	// 总金额
	// 这个注解代表JSON和javaBean转换时忽略
	@JsonIgnore
	public BigDecimal getTotalPrice() {
		// 下面的是测试用
		// BigDecimal result = new BigDecimal(10);
		return getProductPrice().add(getFee());
		// return result;
	}
	// public static void main(String[] args) {
	// BigDecimal result = new BigDecimal(0);
	// BigDecimal a = new BigDecimal(10.5);
	// result = result.add(new BigDecimal(2).multiply(a));
	// System.out.println(result);
	// }
}
