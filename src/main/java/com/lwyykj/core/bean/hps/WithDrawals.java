package com.lwyykj.core.bean.hps;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WithDrawals implements Serializable {
    private Integer id;

    /**
     * 药房ID
     */
    private Integer phId;

    /**
     * 提现银行卡预留电话
     */
    private String tel;

    /**
     * 开户人名字
     */
    private String name;

    /**
     * 卡号
     */
    private String banknum;

    /**
     * 银行名字
     */
    private String bankname;

    /**
     * 开户行
     */
    private String bankdeposit;

    /**
     * 提现金额
     */
    private BigDecimal money;

    /**
     * 资金用途
     */
    private String msg;

    private Date addtime;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 申请审核状态，0等待审核，1已通过，2被拒绝
     */
    private Integer isShow;

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBanknum() {
        return banknum;
    }

    public void setBanknum(String banknum) {
        this.banknum = banknum == null ? null : banknum.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankdeposit() {
        return bankdeposit;
    }

    public void setBankdeposit(String bankdeposit) {
        this.bankdeposit = bankdeposit == null ? null : bankdeposit.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phId=").append(phId);
        sb.append(", tel=").append(tel);
        sb.append(", name=").append(name);
        sb.append(", banknum=").append(banknum);
        sb.append(", bankname=").append(bankname);
        sb.append(", bankdeposit=").append(bankdeposit);
        sb.append(", money=").append(money);
        sb.append(", msg=").append(msg);
        sb.append(", addtime=").append(addtime);
        sb.append(", isDel=").append(isDel);
        sb.append(", isShow=").append(isShow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}