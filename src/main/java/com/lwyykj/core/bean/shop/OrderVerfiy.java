package com.lwyykj.core.bean.shop;

import java.util.List;

import com.lwyykj.core.bean.product.ProductStandard;

public class OrderVerfiy {
	private Integer fac_id;
	private List<ProductStandard> productStandards;
	private String fac_name;

	public Integer getFac_id() {
		return fac_id;
	}

	public void setFac_id(Integer fac_id) {
		this.fac_id = fac_id;
	}

	public List<ProductStandard> getProductStandards() {
		return productStandards;
	}

	public void setProductStandards(List<ProductStandard> productStandards) {
		this.productStandards = productStandards;
	}

	public String getFac_name() {
		return fac_name;
	}

	public void setFac_name(String fac_name) {
		this.fac_name = fac_name;
	}

}
