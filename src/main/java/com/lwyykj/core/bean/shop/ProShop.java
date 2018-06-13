package com.lwyykj.core.bean.shop;

import java.util.List;

public class ProShop {
	private Integer fac_id;
	private String fac_name;
	private List<BuyerItem> buyerItems;

	public Integer getFac_id() {
		return fac_id;
	}

	public void setFac_id(Integer fac_id) {
		this.fac_id = fac_id;
	}

	public String getFac_name() {
		return fac_name;
	}

	public void setFac_name(String fac_name) {
		this.fac_name = fac_name;
	}

	public List<BuyerItem> getBuyerItems() {
		return buyerItems;
	}

	public void setBuyerItems(List<BuyerItem> buyerItems) {
		this.buyerItems = buyerItems;
	}

}
