package com.lwyykj.core.bean.shop;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrdersPro implements Serializable {
    private Integer id;

    /**
     * 产品ID
     */
    private Integer pid;

    /**
     * 大单ID
     */
    private Integer oid;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 当前单价
     */
    private BigDecimal money;

    /**
     * 快递单号
     */
    private String kdnum;

    /**
     * 发货状态 0-1
     */
    private Integer opstyle;

    /**
     * 发货时间
     */
    private Integer sendtime;

    /**
     * 退货状态
     */
    private Integer refundState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getKdnum() {
        return kdnum;
    }

    public void setKdnum(String kdnum) {
        this.kdnum = kdnum == null ? null : kdnum.trim();
    }

    public Integer getOpstyle() {
        return opstyle;
    }

    public void setOpstyle(Integer opstyle) {
        this.opstyle = opstyle;
    }

    public Integer getSendtime() {
        return sendtime;
    }

    public void setSendtime(Integer sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", oid=").append(oid);
        sb.append(", num=").append(num);
        sb.append(", money=").append(money);
        sb.append(", kdnum=").append(kdnum);
        sb.append(", opstyle=").append(opstyle);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", refundState=").append(refundState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}