package com.lwyykj.core.bean.shop;

import java.io.Serializable;
import java.math.BigDecimal;

public class proBrandShop implements Serializable {
    private Integer skuId;
    /**
     * 产品名称
     */
    private String proName;

    /**
     * 标准产品ID
     */
    private Integer proId;

    private Integer supId;

    /**
     * 品牌名
     */
    private String brandName;

    /**
     * 厂家名字
     */
    private String facName;

    /**
     * 厂家id
     */
    private Integer facId;

    /**
     * 厂家名
     */
    private String supName;

    /**
     * 登录电话
     */
    private String phone;

    /**
     * 规格、净含量
     */
    private String spec;

    /**
     * 厂商指导价
     */
    private BigDecimal guidingPrice;

    /**
     * 品牌ID
     */
    private Integer brandId;

    private static final long serialVersionUID = 1L;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName == null ? null : facName.trim();
    }

    public Integer getFacId() {
        return facId;
    }

    public void setFacId(Integer facId) {
        this.facId = facId;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public BigDecimal getGuidingPrice() {
        return guidingPrice;
    }

    public void setGuidingPrice(BigDecimal guidingPrice) {
        this.guidingPrice = guidingPrice;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skuId=").append(skuId);
        sb.append(", proName=").append(proName);
        sb.append(", proId=").append(proId);
        sb.append(", supId=").append(supId);
        sb.append(", brandName=").append(brandName);
        sb.append(", facName=").append(facName);
        sb.append(", facId=").append(facId);
        sb.append(", supName=").append(supName);
        sb.append(", phone=").append(phone);
        sb.append(", spec=").append(spec);
        sb.append(", guidingPrice=").append(guidingPrice);
        sb.append(", brandId=").append(brandId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}