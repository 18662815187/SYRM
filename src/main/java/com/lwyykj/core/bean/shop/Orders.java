package com.lwyykj.core.bean.shop;

import java.io.Serializable;

public class Orders implements Serializable {
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 邮寄地址ID
     */
    private Integer sendId;

    /**
     * 支付状态：0未支付，1已支付，2已完成,3有退款，4申请退款，5已退款
     */
    private Integer type;

    /**
     * 订单外显单号
     */
    private String orderNum;

    private Integer addtime;

    private Integer paytime;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 读取状态
     */
    private Integer status;

    /**
     * 订单创建方式0自行购买，1医生处方
     */
    private Integer createStyle;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getPaytime() {
        return paytime;
    }

    public void setPaytime(Integer paytime) {
        this.paytime = paytime;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateStyle() {
        return createStyle;
    }

    public void setCreateStyle(Integer createStyle) {
        this.createStyle = createStyle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", sendId=").append(sendId);
        sb.append(", type=").append(type);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", addtime=").append(addtime);
        sb.append(", paytime=").append(paytime);
        sb.append(", isDel=").append(isDel);
        sb.append(", status=").append(status);
        sb.append(", createStyle=").append(createStyle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}