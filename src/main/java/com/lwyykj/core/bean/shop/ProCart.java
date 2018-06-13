package com.lwyykj.core.bean.shop;

import java.io.Serializable;
import java.math.BigDecimal;
import com.lwyykj.core.bean.product.ProductStandard;

@SuppressWarnings("serial")
public class ProCart implements Serializable {
	private Integer pro_id;
	private Integer fac_id;
	private BigDecimal price;
	private ProductStandard productStandard;

	public ProductStandard getProductStandard() {
		return productStandard;
	}
	public void setProductStandard(ProductStandard productStandard) {
		this.productStandard = productStandard;
	}

	public Integer getPro_id() {
		return pro_id;
	}

	public void setPro_id(Integer pro_id) {
		this.pro_id = pro_id;
	}

	public Integer getFac_id() {
		return fac_id;
	}

	public void setFac_id(Integer fac_id) {
		this.fac_id = fac_id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
