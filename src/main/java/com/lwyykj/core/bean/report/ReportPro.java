package com.lwyykj.core.bean.report;

import java.io.Serializable;
import java.math.BigDecimal;


public class ReportPro implements Serializable {
   

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
    private Integer proId;

    private Integer skuId;

    /**
     * 产品名称
     */
    private String proName;

    /**
     * 品牌名
     */
    private String brandName;

    /**
     * 厂家名字
     */
    private String facName;

    /**
     * 药房ID
     */
    private Integer phId;

    /**
     * 售价
     */
    private BigDecimal price;

    /**
     * 是否删除，0否，1是
     */
    private Boolean isDel;

    /**
     * 封面图
     */
    private String pic;

    /**
     * 规格、净含量
     */
    private String spec;
    /**
     * 销售总数
     * 
     */
    private int totalNum;
    /**
     * 总销售额
     * 
     */
    private BigDecimal totalFee;

    public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public BigDecimal getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}


    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

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

    public Integer getPhId() {
        return phId;
    }

    public void setPhId(Integer phId) {
        this.phId = phId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
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
        sb.append(", proId=").append(proId);
        sb.append(", skuId=").append(skuId);
        sb.append(", proName=").append(proName);
        sb.append(", brandName=").append(brandName);
        sb.append(", facName=").append(facName);
        sb.append(", phId=").append(phId);
        sb.append(", price=").append(price);
        sb.append(", isDel=").append(isDel);
        sb.append(", pic=").append(pic);
        sb.append(", spec=").append(spec);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}