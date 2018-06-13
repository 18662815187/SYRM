package com.lwyykj.core.bean.hps;

import java.io.Serializable;
import java.math.BigDecimal;

public class Hospital implements Serializable {
    private Integer id;

    /**
     * 医院名称
     */
    private String user;

    /**
     * 代表图片
     */
    private String picture;

    /**
     * 密码
     */
    private String pass;

    /**
     * 电话（登录帐号）
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 余额
     */
    private BigDecimal money;

    /**
     * 是否已审核
     */
    private Integer isshow;

    /**
     * 简介
     */
    private String discription;

    /**
     * 纬度
     */
    private BigDecimal positionX;

    /**
     * 经度
     */
    private BigDecimal positionY;

    /**
     * 二维码
     */
    private String qrcode;

    /**
     * 省份ID
     */
    private String pcode;

    /**
     * 市ID
     */
    private String ccode;

    /**
     * 区ID
     */
    private String acode;

    /**
     * 营业执照
     */
    private String license;

    /**
     * 医疗机构执业资格证
     */
    private String certificate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    public BigDecimal getPositionX() {
        return positionX;
    }

    public void setPositionX(BigDecimal positionX) {
        this.positionX = positionX;
    }

    public BigDecimal getPositionY() {
        return positionY;
    }

    public void setPositionY(BigDecimal positionY) {
        this.positionY = positionY;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode == null ? null : ccode.trim();
    }

    public String getAcode() {
        return acode;
    }

    public void setAcode(String acode) {
        this.acode = acode == null ? null : acode.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", picture=").append(picture);
        sb.append(", pass=").append(pass);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", money=").append(money);
        sb.append(", isshow=").append(isshow);
        sb.append(", discription=").append(discription);
        sb.append(", positionX=").append(positionX);
        sb.append(", positionY=").append(positionY);
        sb.append(", qrcode=").append(qrcode);
        sb.append(", pcode=").append(pcode);
        sb.append(", ccode=").append(ccode);
        sb.append(", acode=").append(acode);
        sb.append(", license=").append(license);
        sb.append(", certificate=").append(certificate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}