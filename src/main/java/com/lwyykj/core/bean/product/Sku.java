package com.lwyykj.core.bean.product;

import java.io.Serializable;
import java.math.BigDecimal;

public class Sku implements Serializable {
	private Integer id;

	/**
	 * 药房ID
	 */
	private Integer phId;

	/**
	 * 标准产品ID
	 */
	private Integer proStandId;

	/**
	 * 库存
	 */
	private Integer stock;

	/**
	 * 购买限制，用于锁库存,预留字段
	 */
	private Integer buyLimit;

	/**
	 * 售价
	 */
	private BigDecimal price;

	/**
	 * 预留字段，活动价格
	 */
	private BigDecimal activityPrice;

	/**
	 * 是否有赠品 0无1有
	 */
	private Boolean isGift;

	/**
	 * 赠品id
	 */
	private Integer giftId;

	/**
	 * 是否删除，0否，1是
	 */
	private Boolean isDel;

	/**
	 * 是否上架：0否，1是
	 */
	private Boolean isShow;
	/**
	 * 产品对象
	 */
	private ProductStandard productStandard;
	private static final long serialVersionUID = 1L;

	public ProductStandard getProductStandard() {
		return productStandard;
	}

	public void setProductStandard(ProductStandard productStandard) {
		this.productStandard = productStandard;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPhId() {
		return phId;
	}

	public void setPhId(Integer phId) {
		this.phId = phId;
	}

	public Integer getProStandId() {
		return proStandId;
	}

	public void setProStandId(Integer proStandId) {
		this.proStandId = proStandId;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getBuyLimit() {
		return buyLimit;
	}

	public void setBuyLimit(Integer buyLimit) {
		this.buyLimit = buyLimit;
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

	public Boolean getIsGift() {
		return isGift;
	}

	public void setIsGift(Boolean isGift) {
		this.isGift = isGift;
	}

	public Integer getGiftId() {
		return giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

	public Boolean getIsShow() {
		return isShow;
	}

	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", phId=").append(phId);
		sb.append(", proStandId=").append(proStandId);
		sb.append(", stock=").append(stock);
		sb.append(", buyLimit=").append(buyLimit);
		sb.append(", price=").append(price);
		sb.append(", activityPrice=").append(activityPrice);
		sb.append(", isGift=").append(isGift);
		sb.append(", giftId=").append(giftId);
		sb.append(", isDel=").append(isDel);
		sb.append(", isShow=").append(isShow);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}