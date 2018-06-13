package com.lwyykj.core.bean.hps;

import java.io.Serializable;
import java.math.BigDecimal;

public class Supplier implements Serializable {
    private Integer id;

    /**
     * 厂家名
     */
    private String supName;

    /**
     * 负责人名字
     */
    private String manager;

    /**
     * 登录电话
     */
    private String phone;

    /**
     * 简介
     */
    private String description;

    /**
     * 图标
     */
    private String logo;

    /**
     * 密码
     */
    private String pass;

    private BigDecimal money;

    /**
     * 父级ID用于主副帐号，0为自身
     */
    private Integer parentId;

    private Integer isshow;

    private Integer regtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public Integer getRegtime() {
        return regtime;
    }

    public void setRegtime(Integer regtime) {
        this.regtime = regtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supName=").append(supName);
        sb.append(", manager=").append(manager);
        sb.append(", phone=").append(phone);
        sb.append(", description=").append(description);
        sb.append(", logo=").append(logo);
        sb.append(", pass=").append(pass);
        sb.append(", money=").append(money);
        sb.append(", parentId=").append(parentId);
        sb.append(", isshow=").append(isshow);
        sb.append(", regtime=").append(regtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}