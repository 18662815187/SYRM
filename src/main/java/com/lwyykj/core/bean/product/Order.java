package com.lwyykj.core.bean.product;

import java.io.Serializable;

public class Order implements Serializable {
	private Integer orderId;

	/**
	 * 产品名称
	 */
	private String productName;

	/**
	 * 品牌名
	 */
	private String brandname;

	/**
	 * 金额
	 */
	private Double price;

	/**
	 * 数量
	 */
	private Integer num;

	/**
	 * 封面图
	 */
	private String pic;

	/**
	 * 厂家名字
	 */
	private String factoryname;

	/**
	 * 发货状态0未发货1已发货2已完成订单
	 */
	private Integer opstyle;

	/**
	 * 订单号
	 */
	private String orderNum;

	private Integer addtime;

	private String docName;

	/**
	 * 医院名称
	 */
	private String hosName;

	/**
	 * 药房ID，自增长
	 */
	private Integer phId;

	/**
	 * 订单状态(0未支付，1已支付，2已完成，3有退款,4申请退款,5已退款)
	 */
	private Integer style;

	/**
	 * 订单生成方式：0医生开具处方生成；1用户在平台自行购买
	 */
	private Integer style2;

	/**
	 * 支付订单的时间
	 */
	private Integer paytime;

	/**
	 * 退货或者换货状态0,1退款申请中，2已退款，3换货申请中4.已退款
	 */
	private Integer refundState;

	/**
	 * 用户名
	 */
	private String buyername;

	/**
	 * 职业
	 */
	private String tel;

	/**
	 * 规格、净含量
	 */
	private String spec;

	/**
	 * 主键
	 */
	private Integer pid;

	private static final long serialVersionUID = 1L;

	// 总金额
	public Double getFee() {
		return num * price;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname == null ? null : brandname.trim();
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}

	public String getFactoryname() {
		return factoryname;
	}

	public void setFactoryname(String factoryname) {
		this.factoryname = factoryname == null ? null : factoryname.trim();
	}

	public Integer getOpstyle() {
		return opstyle;
	}

	public void setOpstyle(Integer opstyle) {
		this.opstyle = opstyle;
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

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName == null ? null : docName.trim();
	}

	public String getHosName() {
		return hosName;
	}

	public void setHosName(String hosName) {
		this.hosName = hosName == null ? null : hosName.trim();
	}

	public Integer getPhId() {
		return phId;
	}

	public void setPhId(Integer phId) {
		this.phId = phId;
	}

	public Integer getStyle() {
		return style;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}

	public Integer getStyle2() {
		return style2;
	}

	public void setStyle2(Integer style2) {
		this.style2 = style2;
	}

	public Integer getPaytime() {
		return paytime;
	}

	public void setPaytime(Integer paytime) {
		this.paytime = paytime;
	}

	public Integer getRefundState() {
		return refundState;
	}

	public void setRefundState(Integer refundState) {
		this.refundState = refundState;
	}

	public String getBuyername() {
		return buyername;
	}

	public void setBuyername(String buyername) {
		this.buyername = buyername == null ? null : buyername.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec == null ? null : spec.trim();
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", orderId=").append(orderId);
		sb.append(", productName=").append(productName);
		sb.append(", brandname=").append(brandname);
		sb.append(", price=").append(price);
		sb.append(", num=").append(num);
		sb.append(", pic=").append(pic);
		sb.append(", factoryname=").append(factoryname);
		sb.append(", opstyle=").append(opstyle);
		sb.append(", orderNum=").append(orderNum);
		sb.append(", addtime=").append(addtime);
		sb.append(", docName=").append(docName);
		sb.append(", hosName=").append(hosName);
		sb.append(", phId=").append(phId);
		sb.append(", style=").append(style);
		sb.append(", style2=").append(style2);
		sb.append(", paytime=").append(paytime);
		sb.append(", refundState=").append(refundState);
		sb.append(", buyername=").append(buyername);
		sb.append(", tel=").append(tel);
		sb.append(", spec=").append(spec);
		sb.append(", pid=").append(pid);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}