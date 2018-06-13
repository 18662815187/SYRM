<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<base href="<%=basePath%>"></base>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>支付</title>
<script src="/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/index.css" />
<link rel="stylesheet" type="text/css" href="/css/payment.css" />
<script type="text/javascript">
	function pay(ob) {
		var mon = '<div class="money">支付<b >58.00</b>元</div>'
		$(".money").remove()
		$(".payment").removeClass('payment_w');
		$(ob).addClass('payment_w');
		$(ob).find('input[type="radio"]').attr("checked", "true")
		$(ob).append(mon)
	}
</script>
</head>
<body>
	<div class="head">
		<div class="head_w">

			<span class="head_w_text">我的收银台</span> <span class="head_w_text"
				style="float: right; font-size: 14px;">1567895102</span><span
				class="head_w_text" style="float: right; font-size: 14px;">支付账号：</span>
		</div>
	</div>
	<div class="body">
		<div class="container">
			<img src="img/two.png"
				style="width: 100px; height: 100px; margin-right: 25px;" />
			<div class="fle">
				<p>
					订单标号：<span>1233124512612731812390</span>
				</p>
				<p>
					订单数量：<span>3</span>件
				</p>
			</div>
			<div class="fle">
				<div style="float: right; padding: 10px;">
					实际支付 <b>58.00</b> 元
				</div>
			</div>
		</div>
		<div style="height: 30px; position: relative;">
			<div class="tou">订单详情</div>
		</div>
		<table width="100%">
			<tr>
				<td>
					<div class="payment" onclick="pay(this)">
						<input type="radio" name="payment" id="" value=""
							checked="checked" style="padding-bottom: 10px;" /> <img
							src="img/zifubao.png" width="28px" style="margin-top: 10px;" /> <span>
							支付宝 </span>
						<div class="recommend">推荐</div>

					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="payment " onclick="pay(this)">
						<input type="radio" name="payment" id="" value="" /> <img
							src="img/weixing.png" width="25px" /> <span id=""> 微信 </span>
					</div>
				</td>
			</tr>
			<tr>
				<td><hr style="border: 1px dashed #cdcdcd; margin: 20px;" /></td>
			</tr>
			<tr>
				<td><input type="button" id="pay" class="pay" value="确认付款" /></td>
			</tr>
		</table>

		<div style="text-align: center; margin-top: 15px; color: #666;">
			ICP:<span>浙2b-20150808</span>
		</div>
	</div>
</body>
</html>
