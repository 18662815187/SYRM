package com.lwyykj.core.bean.hps;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pharmacy implements Serializable {
    /**
     * 药房ID，自增长
     */
    private Integer id;

    /**
     * 药房名称
     */
    private String pharmacyName;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 密码
     */
    private String password;

    /**
     * 认证图片
     */
    private String authImg;

    /**
     * 负责人、店长
     */
    private String manager;

    /**
     * 二维码保存路径
     */
    private String qrCode;

    /**
     * 所属医院ID
     */
    private Integer hosId;

    /**
     * 药房类型，0医院内部，1医院外部合作药房
     */
    private Byte type;

    /**
     * 结算费率
     */
    private String commission;

    /**
     * 结算周期，以天为单位
     */
    private String settlement;

    /**
     * 父级id,默认为0即自身，用于连锁药房
     */
    private Integer parentId;

    /**
     * 地址
     */
    private String address;

    /**
     * 用于审核判断的医院名字
     */
    private String hosName;

    /**
     * 余额
     */
    private BigDecimal money;

    /**
     * 是否删除，0删除，1未删除，在java中对应true/false
     */
    private Boolean isDel;

    /**
     * 是否审核通过，0未通过，1已通过，2正在审核，3审核被驳回请重新审核
     */
    private Integer isShow;
    /**
     * 医院对象
     * 
     */
    private Hospital hospital;

    private static final long serialVersionUID = 1L;
    
    public String[] getImages() {
		if (authImg == null || authImg == "") {
			return null;
		}
		return authImg.split(",");
	}
    

    public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName == null ? null : pharmacyName.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAuthImg() {
        return authImg;
    }

    public void setAuthImg(String authImg) {
        this.authImg = authImg == null ? null : authImg.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public Integer getHosId() {
        return hosId;
    }

    public void setHosId(Integer hosId) {
        this.hosId = hosId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission == null ? null : commission.trim();
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement == null ? null : settlement.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName == null ? null : hosName.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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
        sb.append(", pharmacyName=").append(pharmacyName);
        sb.append(", tel=").append(tel);
        sb.append(", password=").append(password);
        sb.append(", authImg=").append(authImg);
        sb.append(", manager=").append(manager);
        sb.append(", qrCode=").append(qrCode);
        sb.append(", hosId=").append(hosId);
        sb.append(", type=").append(type);
        sb.append(", commission=").append(commission);
        sb.append(", settlement=").append(settlement);
        sb.append(", parentId=").append(parentId);
        sb.append(", address=").append(address);
        sb.append(", hosName=").append(hosName);
        sb.append(", money=").append(money);
        sb.append(", isDel=").append(isDel);
        sb.append(", isShow=").append(isShow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}