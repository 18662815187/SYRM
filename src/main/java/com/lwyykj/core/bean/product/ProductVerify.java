package com.lwyykj.core.bean.product;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductVerify implements Serializable {
    private Integer id;

    /**
     * 药店ID
     */
    private Integer phId;

    /**
     * 商品名
     */
    private String productName;

    /**
     * 品牌名
     */
    private String brandName;

    /**
     * 标题图
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
     * 生产厂家ID
     */
    private Integer facId;

    /**
     * 工厂名
     */
    private String factoryName;

    private String content;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 预留字段，购买限制
     */
    private Integer astrict;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 活动价格，预留字段
     */
    private BigDecimal activityPrice;

    /**
     * 是否有赠品0无1有
     */
    private Boolean isGift;

    /**
     * 赠品id
     */
    private Integer giftId;

    /**
     * 是否删除0未1已
     */
    private Boolean isDel;

    /**
     * 0未审核1已审核
     */
    private Integer isShow;

    private Integer brandId;

    /**
     * 备用厂家ID
     */
    private Integer factoryId;
    
    /**
     * 图片数组
     */
    public String[] getPics() {
    	if (images == null || images == "") {
    		return null;
    	}
    	return images.split(",");
    }

    private static final long serialVersionUID = 1L;

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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
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

    public Integer getFacId() {
        return facId;
    }

    public void setFacId(Integer facId) {
        this.facId = facId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getAstrict() {
        return astrict;
    }

    public void setAstrict(Integer astrict) {
        this.astrict = astrict;
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

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phId=").append(phId);
        sb.append(", productName=").append(productName);
        sb.append(", brandName=").append(brandName);
        sb.append(", pic=").append(pic);
        sb.append(", images=").append(images);
        sb.append(", spec=").append(spec);
        sb.append(", facId=").append(facId);
        sb.append(", factoryName=").append(factoryName);
        sb.append(", content=").append(content);
        sb.append(", stock=").append(stock);
        sb.append(", astrict=").append(astrict);
        sb.append(", price=").append(price);
        sb.append(", activityPrice=").append(activityPrice);
        sb.append(", isGift=").append(isGift);
        sb.append(", giftId=").append(giftId);
        sb.append(", isDel=").append(isDel);
        sb.append(", isShow=").append(isShow);
        sb.append(", brandId=").append(brandId);
        sb.append(", factoryId=").append(factoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}