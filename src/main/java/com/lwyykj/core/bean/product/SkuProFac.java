package com.lwyykj.core.bean.product;

import java.io.Serializable;
import java.math.BigDecimal;

import com.lwyykj.core.bean.shop.supBrand;

public class SkuProFac implements Serializable {
	private Integer id;

	/**
	 * 售价
	 */
	private BigDecimal price;

	/**
	 * 预留字段，活动价格
	 */
	private BigDecimal activityPrice;

	/**
	 * 库存
	 */
	private Integer stock;

	/**
	 * 标准产品ID
	 */
	private Integer proId;

	/**
	 * 产品名称
	 */
	private String productName;

	/**
	 * 品牌ID
	 */
	private Integer brandId;

	/**
	 * 品牌名
	 */
	private String brandName;

	/**
	 * 是否删除，0否，1是
	 */
	private Boolean isDel;

	/**
	 * 厂家名字
	 */
	private String factoryName;

	/**
	 * 厂商指导价
	 */
	private BigDecimal guidingPrice;

	/**
	 * 封面图
	 */
	private String pic;

	/**
	 * 药房ID
	 */
	private Integer phId;

	/**
	 * 规格、净含量
	 */
	private String spec;

	/**
	 * 供应商
	 */
	private supBrand supBrand;

	public supBrand getSupBrand() {
		return supBrand;
	}

	public void setSupBrand(supBrand supBrand) {
		this.supBrand = supBrand;
	}

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getActivityPrice() {
		return activityPrice;
	}

	public void setActivityPrice(BigDecimal activityPrice) {
		this.activityPrice = activityPrice;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName == null ? null : brandName.trim();
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName == null ? null : factoryName.trim();
	}

	public BigDecimal getGuidingPrice() {
		return guidingPrice;
	}

	public void setGuidingPrice(BigDecimal guidingPrice) {
		this.guidingPrice = guidingPrice;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}

	public Integer getPhId() {
		return phId;
	}

	public void setPhId(Integer phId) {
		this.phId = phId;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec == null ? null : spec.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", price=").append(price);
		sb.append(", activityPrice=").append(activityPrice);
		sb.append(", stock=").append(stock);
		sb.append(", proId=").append(proId);
		sb.append(", productName=").append(productName);
		sb.append(", brandId=").append(brandId);
		sb.append(", brandName=").append(brandName);
		sb.append(", isDel=").append(isDel);
		sb.append(", factoryName=").append(factoryName);
		sb.append(", guidingPrice=").append(guidingPrice);
		sb.append(", pic=").append(pic);
		sb.append(", phId=").append(phId);
		sb.append(", spec=").append(spec);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}