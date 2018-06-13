package com.lwyykj.core.bean.hps;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HisPh implements Serializable {
    private Integer id;

    /**
     * 药房ID
     */
    private Integer phId;

    /**
     * 具体操作
     */
    private String msg;

    /**
     * 上次变更前金额
     */
    private BigDecimal money1;

    /**
     * 申请体现的金额
     */
    private BigDecimal money;

    /**
     * 1提现 2增加
     */
    private Integer style;

    /**
     * 记录时间
     */
    private Date addtime;

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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public BigDecimal getMoney1() {
        return money1;
    }

    public void setMoney1(BigDecimal money1) {
        this.money1 = money1;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phId=").append(phId);
        sb.append(", msg=").append(msg);
        sb.append(", money1=").append(money1);
        sb.append(", money=").append(money);
        sb.append(", style=").append(style);
        sb.append(", addtime=").append(addtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}