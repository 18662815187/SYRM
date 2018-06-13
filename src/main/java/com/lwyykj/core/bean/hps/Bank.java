package com.lwyykj.core.bean.hps;

import java.io.Serializable;

public class Bank implements Serializable {
    private Integer id;

    /**
     * 银行卡号
     */
    private String bankid;

    /**
     * 银行名称
     */
    private String bankname;

    /**
     * 提现用户类型（1用户；2医生；3医院；4供货商;5药房）
     */
    private Boolean type;

    /**
     * 用户ID/
     */
    private Integer uid;

    /**
     * 开户姓名
     */
    private String username;

    /**
     * 银行预留手机号码
     */
    private String tel;

    /**
     * 绑定时间
     */
    private Integer addtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bankid=").append(bankid);
        sb.append(", bankname=").append(bankname);
        sb.append(", type=").append(type);
        sb.append(", uid=").append(uid);
        sb.append(", username=").append(username);
        sb.append(", tel=").append(tel);
        sb.append(", addtime=").append(addtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}