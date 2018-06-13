package com.lwyykj.core.bean.app;

import java.io.Serializable;
import java.math.BigDecimal;

public class Doctor implements Serializable {
    private Integer id;

    private String user;

    /**
     * 头像
     */
    private String pic;

    /**
     * 执业医师编号
     */
    private String practiceId;

    /**
     * 密码
     */
    private String pass;

    private String email;

    private String phone;

    private String address;

    /**
     * 纬度
     */
    private BigDecimal positionX;

    /**
     * 性别（1男，0女）
     */
    private Boolean sex;

    /**
     * 擅长
     */
    private String begoodat;

    private Float money;

    /**
     * 注册时间
     */
    private Integer regtime;

    /**
     * 经度
     */
    private BigDecimal positionY;

    /**
     * 所属医院ID
     */
    private Integer hosId;

    /**
     * 在线问答价格
     */
    private Float price1;

    /**
     * 电话拨号价格
     */
    private Float price2;

    /**
     * 美容顾问价格
     */
    private Float price3;

    /**
     * 预约挂号价格
     */
    private Float price4;

    /**
     * 点刀价格
     */
    private Float price5;

    /**
     * 服务时间
     */
    private String serviceTime;

    /**
     * 是否在线
     */
    private Integer isonline;

    /**
     * 是否通过审核 2正在审核
     */
    private Integer isshow;

    /**
     * 名医馆标识字段
     */
    private Integer famous;

    /**
     * 最美医生标记字段
     */
    private Integer beautiful;

    /**
     * 账号状态
     */
    private Boolean condition2;

    /**
     * 职位1=主治医师，2=副主任医师，3=主任医师
     */
    private String position;

    private String tk;

    /**
     * 二维码路径
     */
    private String qrcode;

    /**
     * 评论评分（平均值）
     */
    private Float appraise;

    /**
     * 省份编码
     */
    private String pcode;

    /**
     * 市区编码
     */
    private String ccode;

    /**
     * 地区编码
     */
    private String acode;

    /**
     * 身份证照片
     */
    private String idcardpic;

    /**
     * 医师资格证照片
     */
    private String yishizigepic;

    /**
     * 执业资格证照片
     */
    private String zhiyezigepic;

    /**
     * 工作牌照片
     */
    private String workcardpic;

    private Integer age;

    /**
     * 环信登录账户
     */
    private String hxLogin;

    /**
     * 打赏开关控制（0关闭，1开启。此功能用于IOS审核）
     */
    private Integer mark1;

    private Integer addtime;

    /**
     * 是否为测试帐号
     */
    private Integer testUser;

    /**
     * 微信openid
     */
    private String openid;

    private String codeTime;

    private String code;

    /**
     * 注册时填写的医院名称
     */
    private String hospital;

    /**
     * 简介
     */
    private String description;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getPracticeId() {
        return practiceId;
    }

    public void setPracticeId(String practiceId) {
        this.practiceId = practiceId == null ? null : practiceId.trim();
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

    public BigDecimal getPositionX() {
        return positionX;
    }

    public void setPositionX(BigDecimal positionX) {
        this.positionX = positionX;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBegoodat() {
        return begoodat;
    }

    public void setBegoodat(String begoodat) {
        this.begoodat = begoodat == null ? null : begoodat.trim();
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getRegtime() {
        return regtime;
    }

    public void setRegtime(Integer regtime) {
        this.regtime = regtime;
    }

    public BigDecimal getPositionY() {
        return positionY;
    }

    public void setPositionY(BigDecimal positionY) {
        this.positionY = positionY;
    }

    public Integer getHosId() {
        return hosId;
    }

    public void setHosId(Integer hosId) {
        this.hosId = hosId;
    }

    public Float getPrice1() {
        return price1;
    }

    public void setPrice1(Float price1) {
        this.price1 = price1;
    }

    public Float getPrice2() {
        return price2;
    }

    public void setPrice2(Float price2) {
        this.price2 = price2;
    }

    public Float getPrice3() {
        return price3;
    }

    public void setPrice3(Float price3) {
        this.price3 = price3;
    }

    public Float getPrice4() {
        return price4;
    }

    public void setPrice4(Float price4) {
        this.price4 = price4;
    }

    public Float getPrice5() {
        return price5;
    }

    public void setPrice5(Float price5) {
        this.price5 = price5;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime == null ? null : serviceTime.trim();
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public Integer getFamous() {
        return famous;
    }

    public void setFamous(Integer famous) {
        this.famous = famous;
    }

    public Integer getBeautiful() {
        return beautiful;
    }

    public void setBeautiful(Integer beautiful) {
        this.beautiful = beautiful;
    }

    public Boolean getCondition2() {
        return condition2;
    }

    public void setCondition2(Boolean condition2) {
        this.condition2 = condition2;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
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

    public Float getAppraise() {
        return appraise;
    }

    public void setAppraise(Float appraise) {
        this.appraise = appraise;
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

    public String getIdcardpic() {
        return idcardpic;
    }

    public void setIdcardpic(String idcardpic) {
        this.idcardpic = idcardpic == null ? null : idcardpic.trim();
    }

    public String getYishizigepic() {
        return yishizigepic;
    }

    public void setYishizigepic(String yishizigepic) {
        this.yishizigepic = yishizigepic == null ? null : yishizigepic.trim();
    }

    public String getZhiyezigepic() {
        return zhiyezigepic;
    }

    public void setZhiyezigepic(String zhiyezigepic) {
        this.zhiyezigepic = zhiyezigepic == null ? null : zhiyezigepic.trim();
    }

    public String getWorkcardpic() {
        return workcardpic;
    }

    public void setWorkcardpic(String workcardpic) {
        this.workcardpic = workcardpic == null ? null : workcardpic.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHxLogin() {
        return hxLogin;
    }

    public void setHxLogin(String hxLogin) {
        this.hxLogin = hxLogin == null ? null : hxLogin.trim();
    }

    public Integer getMark1() {
        return mark1;
    }

    public void setMark1(Integer mark1) {
        this.mark1 = mark1;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getTestUser() {
        return testUser;
    }

    public void setTestUser(Integer testUser) {
        this.testUser = testUser;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getCodeTime() {
        return codeTime;
    }

    public void setCodeTime(String codeTime) {
        this.codeTime = codeTime == null ? null : codeTime.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital == null ? null : hospital.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", pic=").append(pic);
        sb.append(", practiceId=").append(practiceId);
        sb.append(", pass=").append(pass);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", positionX=").append(positionX);
        sb.append(", sex=").append(sex);
        sb.append(", begoodat=").append(begoodat);
        sb.append(", money=").append(money);
        sb.append(", regtime=").append(regtime);
        sb.append(", positionY=").append(positionY);
        sb.append(", hosId=").append(hosId);
        sb.append(", price1=").append(price1);
        sb.append(", price2=").append(price2);
        sb.append(", price3=").append(price3);
        sb.append(", price4=").append(price4);
        sb.append(", price5=").append(price5);
        sb.append(", serviceTime=").append(serviceTime);
        sb.append(", isonline=").append(isonline);
        sb.append(", isshow=").append(isshow);
        sb.append(", famous=").append(famous);
        sb.append(", beautiful=").append(beautiful);
        sb.append(", condition2=").append(condition2);
        sb.append(", position=").append(position);
        sb.append(", tk=").append(tk);
        sb.append(", qrcode=").append(qrcode);
        sb.append(", appraise=").append(appraise);
        sb.append(", pcode=").append(pcode);
        sb.append(", ccode=").append(ccode);
        sb.append(", acode=").append(acode);
        sb.append(", idcardpic=").append(idcardpic);
        sb.append(", yishizigepic=").append(yishizigepic);
        sb.append(", zhiyezigepic=").append(zhiyezigepic);
        sb.append(", workcardpic=").append(workcardpic);
        sb.append(", age=").append(age);
        sb.append(", hxLogin=").append(hxLogin);
        sb.append(", mark1=").append(mark1);
        sb.append(", addtime=").append(addtime);
        sb.append(", testUser=").append(testUser);
        sb.append(", openid=").append(openid);
        sb.append(", codeTime=").append(codeTime);
        sb.append(", code=").append(code);
        sb.append(", hospital=").append(hospital);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}