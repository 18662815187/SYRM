package com.lwyykj.core.bean.product;

import java.io.Serializable;

public class Gift implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * 所属药店ID
     */
    private Integer phId;

    /**
     * 赠品名
     */
    private String giftName;

    /**
     * 赠品库存
     */
    private Integer stock;

    /**
     * 赠品价值
     */
    private Integer price;

    /**
     * 0未删除1已删除
     */
    private Byte isDel;

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

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phId=").append(phId);
        sb.append(", giftName=").append(giftName);
        sb.append(", stock=").append(stock);
        sb.append(", price=").append(price);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}