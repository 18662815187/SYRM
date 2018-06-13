package com.lwyykj.core.bean.product;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductStandard implements Serializable {
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 产品名称
	 */
	private String productName;

	/**
	 * 品牌ID
	 */
	private Integer brandId;

	/**
	 * 封面图
	 */
	private String pic;

	/**
	 * 图集
	 */
	private String images;

	/**
	 * 规格、净含量
	 */
	private String spec;

	/**
	 * 厂家id
	 */
	private Integer factoryId;

	/**
	 * 厂商指导价
	 */
	private BigDecimal guidingPrice;

	/**
	 * 商品介绍
	 */
	private String content;

	/**
	 * 是否删除，0未删除，1已删除
	 */
	private Boolean isDel;
	/**
	 * 工厂对象
	 */
	private Factory factory;
	/**
	 * sku对象
	 * 
	 */
	private Sku sku;
	/**
	 * 品牌对象
	 */
	private Brand brand;
	/**
	 * 临时购物车数量字段
	 */
	private Integer num;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	private static final long serialVersionUID = 1L;

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Integer getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(Integer factoryId) {
		this.factoryId = factoryId;
	}

	public BigDecimal getGuidingPrice() {
		return guidingPrice;
	}

	public void setGuidingPrice(BigDecimal guidingPrice) {
		this.guidingPrice = guidingPrice;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", productName=").append(productName);
		sb.append(", brandId=").append(brandId);
		sb.append(", pic=").append(pic);
		sb.append(", images=").append(images);
		sb.append(", spec=").append(spec);
		sb.append(", factoryId=").append(factoryId);
		sb.append(", guidingPrice=").append(guidingPrice);
		sb.append(", content=").append(content);
		sb.append(", isDel=").append(isDel);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}