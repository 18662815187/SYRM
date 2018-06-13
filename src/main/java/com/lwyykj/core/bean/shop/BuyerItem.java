package com.lwyykj.core.bean.shop;

import java.io.Serializable;

import com.lwyykj.core.bean.product.ProductStandard;
import com.lwyykj.core.bean.product.Sku;

/**
 * 购物项
 * 
 * @author john
 *
 */
public class BuyerItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 发货方ID
	private Integer fac_id;
	// 1.skuid Sku对象有自己的id
	private Sku sku;
	// proCart
	private ProCart proCart;
	// 产品
	private ProductStandard productStandard;

	// 2.Boolean isHave;是否有货
	private Boolean isHave = true;

	// 3.数量,默认一件
	private Integer amount = 1;

	public Integer getFac_id() {
		return fac_id;
	}

	public void setFac_id(Integer fac_id) {
		this.fac_id = fac_id;
	}

	public ProductStandard getProductStandard() {
		return productStandard;
	}

	public void setProductStandard(ProductStandard productStandard) {
		this.productStandard = productStandard;
	}

	public ProCart getProCart() {
		return proCart;
	}

	public void setProCart(ProCart proCart) {
		this.proCart = proCart;
	}

	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public Boolean getIsHave() {
		return isHave;
	}

	public void setIsHave(Boolean isHave) {
		this.isHave = isHave;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((proCart == null) ? 0 : proCart.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)// 比较地址
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())// class
											// cn.itcast.core.bean.BuyerItem，使用class比较
			return false;
		BuyerItem other = (BuyerItem) obj;// class相同时会强制转型再执行下面的操作
		// if (sku == null) {
		// if (other.sku != null)
		// return false;
		// } else if (!sku.getId().equals(other.sku.getId()))//比较skuid
		// return false;
		if (proCart == null) {
			if (other.proCart != null)
				return false;
		} else if (!proCart.getPro_id().equals(other.proCart.getPro_id()))// 比较pro_id
			return false;
		return true;
	}

}
