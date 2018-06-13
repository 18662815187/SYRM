package com.lwyykj.core.bean.product;

import java.io.Serializable;

public class PharmacyOrder implements Serializable {
    private Integer id;

    /**
     * 产品id
     */
    private Integer pid;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 金额
     */
    private Double money;

    /**
     * 大单号
     */
    private Integer oid;

    /**
     * 快递单号
     */
    private String kdnum;

    /**
     * 发货状态0未发货1已发货2已完成订单
     */
    private Integer opstyle;

    /**
     * 处方医生
     */
    private Integer pushDocId;

    /**
     * 发货时间
     */
    private Integer sendtime;

    private String ucode;

    /**
     * 退货或者换货状态0,1退款申请中，2已退款，3换货申请中4.已退款
     */
    private Integer refundState;

    /**
     * 是否删除,0未删除，1已删除
     */
    private Boolean isDel;

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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
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

    public Integer getPushDocId() {
        return pushDocId;
    }

    public void setPushDocId(Integer pushDocId) {
        this.pushDocId = pushDocId;
    }

    public Integer getSendtime() {
        return sendtime;
    }

    public void setSendtime(Integer sendtime) {
        this.sendtime = sendtime;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode == null ? null : ucode.trim();
    }

    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
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
        sb.append(", pid=").append(pid);
        sb.append(", num=").append(num);
        sb.append(", money=").append(money);
        sb.append(", oid=").append(oid);
        sb.append(", kdnum=").append(kdnum);
        sb.append(", opstyle=").append(opstyle);
        sb.append(", pushDocId=").append(pushDocId);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", ucode=").append(ucode);
        sb.append(", refundState=").append(refundState);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}