package com.lwyykj.core.bean.product;

import java.io.Serializable;

public class BrandSup implements Serializable {
    private Integer id;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 药店ID
     */
    private Integer phId;

    /**
     * 品牌业务员联系电话
     */
    private String mgTel;

    /**
     * 0未删除1已删除
     */
    private Boolean isDel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getPhId() {
        return phId;
    }

    public void setPhId(Integer phId) {
        this.phId = phId;
    }

    public String getMgTel() {
        return mgTel;
    }

    public void setMgTel(String mgTel) {
        this.mgTel = mgTel == null ? null : mgTel.trim();
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
        sb.append(", brandId=").append(brandId);
        sb.append(", phId=").append(phId);
        sb.append(", mgTel=").append(mgTel);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}