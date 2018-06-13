package com.lwyykj.core.bean.app;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    private Integer id;

    /**
     * 用户名
     */
    private String user;

    private String pass;

    private String email;

    private Short gid;

    /**
     * 账户余额
     */
    private BigDecimal money;

    /**
     * 头像
     */
    private String pic;

    /**
     * 注册时间
     */
    private Integer regtime;

    private String token;

    private Integer tokentime;

    /**
     * 帐号状态
     */
    private String status;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 职业
     */
    private String phone;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 地区
     */
    private String region;

    /**
     * 是否在线
     */
    private Integer isonline;

    /**
     * 维度—X
     */
    private BigDecimal positionX;

    /**
     * 经度--Y
     */
    private BigDecimal positionY;

    private String tk;

    /**
     * 二维码路径
     */
    private String qrcode;

    private String uMark;

    /**
     * 省份编码
     */
    private String pCode;

    /**
     * 城市编码
     */
    private String cCode;

    /**
     * 地区编码
     */
    private String aCode;

    private String openid;

    /**
     * 环信登录账号
     */
    private String hxLogin;

    /**
     * 帖子屏蔽ID（ex:,5,1,5）
     */
    private String ulcHiden;

    private String code;

    private Integer codeTime;

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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Short getGid() {
        return gid;
    }

    public void setGid(Short gid) {
        this.gid = gid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getRegtime() {
        return regtime;
    }

    public void setRegtime(Integer regtime) {
        this.regtime = regtime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getTokentime() {
        return tokentime;
    }

    public void setTokentime(Integer tokentime) {
        this.tokentime = tokentime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
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

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk == null ? null : tk.trim();
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public String getuMark() {
        return uMark;
    }

    public void setuMark(String uMark) {
        this.uMark = uMark == null ? null : uMark.trim();
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode == null ? null : pCode.trim();
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public String getaCode() {
        return aCode;
    }

    public void setaCode(String aCode) {
        this.aCode = aCode == null ? null : aCode.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getHxLogin() {
        return hxLogin;
    }

    public void setHxLogin(String hxLogin) {
        this.hxLogin = hxLogin == null ? null : hxLogin.trim();
    }

    public String getUlcHiden() {
        return ulcHiden;
    }

    public void setUlcHiden(String ulcHiden) {
        this.ulcHiden = ulcHiden == null ? null : ulcHiden.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getCodeTime() {
        return codeTime;
    }

    public void setCodeTime(Integer codeTime) {
        this.codeTime = codeTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", pass=").append(pass);
        sb.append(", email=").append(email);
        sb.append(", gid=").append(gid);
        sb.append(", money=").append(money);
        sb.append(", pic=").append(pic);
        sb.append(", regtime=").append(regtime);
        sb.append(", token=").append(token);
        sb.append(", tokentime=").append(tokentime);
        sb.append(", status=").append(status);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", nickname=").append(nickname);
        sb.append(", region=").append(region);
        sb.append(", isonline=").append(isonline);
        sb.append(", positionX=").append(positionX);
        sb.append(", positionY=").append(positionY);
        sb.append(", tk=").append(tk);
        sb.append(", qrcode=").append(qrcode);
        sb.append(", uMark=").append(uMark);
        sb.append(", pCode=").append(pCode);
        sb.append(", cCode=").append(cCode);
        sb.append(", aCode=").append(aCode);
        sb.append(", openid=").append(openid);
        sb.append(", hxLogin=").append(hxLogin);
        sb.append(", ulcHiden=").append(ulcHiden);
        sb.append(", code=").append(code);
        sb.append(", codeTime=").append(codeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}