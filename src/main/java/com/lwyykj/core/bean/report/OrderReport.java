package com.lwyykj.core.bean.report;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderReport implements Serializable {
    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 数量
     */
    private Integer num;

    private Integer orderId;

    /**
     * 产品id
     */
    private Integer proId;

    /**
     * 药房ID，自增长
     */
    private Integer phId;

    private Integer addTime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getPhId() {
        return phId;
    }

    public void setPhId(Integer phId) {
        this.phId = phId;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", money=").append(money);
        sb.append(", num=").append(num);
        sb.append(", orderId=").append(orderId);
        sb.append(", proId=").append(proId);
        sb.append(", phId=").append(phId);
        sb.append(", addTime=").append(addTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}