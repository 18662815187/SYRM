package com.lwyykj.core.bean.hps;

import java.io.Serializable;

public class Transaction implements Serializable {
    private Integer id;

    /**
     * 药房ID
     */
    private Integer phId;

    /**
     * 交易记录
     */
    private String transactionRecord;

    /**
     * 交易类型，0增加，1减少，2后台扣款
     */
    private Byte type;

    /**
     * 银行卡ID
     */
    private Integer bankId;

    /**
     * 金额
     */
    private Integer money;

    /**
     * 是否删除，0否，1是
     */
    private Boolean isDel;

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

    public String getTransactionRecord() {
        return transactionRecord;
    }

    public void setTransactionRecord(String transactionRecord) {
        this.transactionRecord = transactionRecord == null ? null : transactionRecord.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
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
        sb.append(", phId=").append(phId);
        sb.append(", transactionRecord=").append(transactionRecord);
        sb.append(", type=").append(type);
        sb.append(", bankId=").append(bankId);
        sb.append(", money=").append(money);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}