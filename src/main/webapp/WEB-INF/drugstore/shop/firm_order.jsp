<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@
page session="false"%>
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
<title>生医容美提醒您确认订单信息</title>
<script src="js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/index.css" />
<link rel="stylesheet" type="text/css" href="/css/firm_order.css" />
<style type="text/css">
.body {
	margin: 0px 8em;
}

.address {
	font-size: 14px;
	padding: 15px;
	margin: 20px 20px;
	border: 1px solid #f1f1f1;
	background-image: url(img/address1.jpg);
	background-repeat: no-repeat;
	background-size: 100% 130px;
	width: 250px;
	height: 100px;
}

.address_o {
	font-size: 14px;
	padding: 15px;
	margin: 20px 20px;
	border: 1px solid #85a1d4;
	background-image: url(img/address.jpg);
	background-repeat: no-repeat;
	background-size: 100% 130px;
	width: 250px;
	height: 100px;
}

.set_address {
	border: 1px solid #f37d2e;
	float: right;
	margin-right: 30px;
	padding: 2px;
	color: #f37d2e;
	border-radius: 3px;
}

.set_address:hover {
	border: 1px solid #ff0036;
	float: right;
	padding: 2px;
	color: #ff0036;
	border-radius: 3px;
}

.text_box {
	width: 80%;
	overflow: hidden;
	text-overflow: ellipsis;
	white-space: nowrap;
	display: inline-block;
	font-size: 14px;
	padding: 0px 0px 20px 0px;
}

.text_box span {
	float: left;
}

.table_head {
	margin: auto;
	font-size: 14px;
	color: #666;
	text-align: center;
}

.red {
	color: red;
	font: 20px;
}

.order_last_box {
	float: right;
}

.order_last {
	width: 250px;
	border: 1px solid red;
	padding: 10px;
	font-size: 14px;
}

.order_last span {
	font-size: 14px;
	color: #666;
}

.order_submit {
	width: 120px;
	height: 40px;
	background-color: red;
	color: #fff;
	padding: 5px 20px;
	font-size: 20px;
	border: 0px;
	float: right;
}

.back {
	color: #2F65BA;
	font-size: 14px;
}

.order_commodity {
	padding: 5px;
}

.order_commodity_w {
	border-bottom: 4px solid #f3f3f3;
}

.order_commodity_w:last-child {
	border-bottom: 4px solid #b2d1ff;
}

.order_commodity td {
	padding: 10px;
	font-size: 14px;
	color: #666;
	border-bottom: 2px solid #fff;
}

.order_commodity td:nth-child(1) {
	width: 80px;
}

.order_commodity td:nth-child(2) {
	width: 360px;
	text-align: left;
}

.order_commodity td:nth-child(3) {
	width: 80px;
}

.order_commodity td:nth-child(4) {
	width: 80px;
}

.order_commodity td:nth-child(5) {
	width: 80px;
}

.order_commodity td:nth-child(6) {
	width: 80px;
}

.order_commodity td:nth-child(7) {
	width: 80px;
}

.firm_w {
	background-color: #b2d1ff;
	display: inline-block;
	padding: 3px;
	color: #fff;
}

.firm_list {
	background-color: #fbfcff;
}

.head_line {
	border-bottom: 2px solid #b2d1ff !important;
}

.list_line {
	border-bottom: 2px solid #fff;
}

.company_total {
	color: red;
}

.gray {
	text-decoration: line-through;
	color: #cdcdcd;
}
</style>
<script type="text/javascript">
	//地址超出三两行就自动隐藏
	window.onload = function() {
		address_red()
		yun()
		//多余的字显示...
		//可以重复使用
		var num = $('.address_text').size()
		for (var i = 0; i < num; i++) {
			var titleStr = $(".address_text").eq(i).text();
			var maxLen = 50;//设置要显示的字符数
			if (titleStr.length > maxLen) {
				$(".address_text").eq(i).html(
						titleStr.substring(0, maxLen) + "...");
			} else {
				$(".address_text").eq(i).html(titleStr);
			}
		}
	}
	//运费
	function yun() {
		$(".yun").each(
				function() {
					if (parseInt($(this).parents("tfoot")
							.find(".company_total").text()) > 79) {
						$(this).attr("class", "gray")
						$("#total_y").attr("class", "gray")
					} else {
						$("#total_w").attr("class", "red")
					}
				})

	}
	//地址背景图片改变
	function address(ob) {
		$(".address").attr("class", "address")
		$(".address_o").attr("class", "address")
		$(ob).attr("class", "address_o")
		address_red()
	}
	function Jump(hre) {
		location.href = hre;
	}
	//加载红框地址
	function address_red() {

		$("#name_val").each(function() {
			var name = $(".address_o").find(".name").text();
			$(this).text(name);
		});
		$("#Oaddress_val").each(function() {
			var address = $(".address_o").find(".address_text").text();
			$(this).text(address)
		});
		//产商的小计
		$(".company_total").each(
				function() {
					var aa = 0
					for (i = 0; i < $(this).parents(".order_commodity").find(
							".subtotal").size(); i++) {
						aa += parseFloat($(this).parents(".order_commodity")
								.find(".subtotal").eq(i).text());
					}
					$(this).text(aa.toFixed(2));
				});
		//产商的物品数量
		$(".company_total_num").each(
				function() {
					$(this).text(
							$(this).parents(".order_commodity").find(
									".subtotal").size());
				});
	};
	//加载地址
	$(document)
			.ready(
					function() {

						yun()
						//加载地址

						if (localStorage.name == undefined
								|| localStorage.name == ",,,") {
							$("#address_add").empty();
							var uio = '<td><div class="address_o" style="color: #999;">（<span>空</span> ）<hr /><p>未查询到收货地址</p><p>添加收货地址</p><p>点击<a id="add_address">管理收货地址</a></p></div></td>'

							$("#address_add").append(uio)

						} else {
							var res1 = localStorage.name.split(",");
							var res2 = localStorage.address.split(",");
							$("#address_add").empty();
							var strhtml = "";
							var strhtml2 = "";
							for (i = 0; i < res1.length; i++) {
								strhtml += '<td><div class="address" onclick="address(this)">（<span class="name">'
										+ res1[i]
										+ '</span> 收）<hr /><div class="address_text"><span >'
										+ res2[i] + '</span></div></div></td>'
							}
							for (i = 0; i < 4 - (res1.length); i++) {
								strhtml2 += '<td style="width: 350px;height: 100px;"></td>'
							}
							$("#address_add").append(strhtml);
							$("#address_add").append(strhtml2);
						}
						num = localStorage.num
						$("#address_add td").eq(num).children().attr("class",
								"address_o")
						//计算价格(小计)
						var sum = 0;
						$(".subtotal").each(
								function() {
									var Osubtotal = ($(this).parents(
											".firm_list").find(".univalent")
											.text())
											* ($(this).parents(".firm_list")
													.find(".number").text())
									sum += parseFloat(Osubtotal);
									$(this).text(Osubtotal.toFixed(2))

								})
						//计算价格(总计)
						$("#total").each(
								function() {
									if (sum < 79) {
										$(this).text(
												(sum + parseFloat($("#total_w")
														.text())).toFixed(2))
										$("#total_two").text(
												(sum + parseFloat($("#total_w")
														.text())).toFixed(2))
									} else {
										$(this).text(sum.toFixed(2))
										$("#total_two").text(sum.toFixed(2))
									}

								})
						$(document).on("click", "#add_address", function() {
							Jump('add_address.html')
						});
					})
	function applyOrder() {
		//var a = $("#pro_ids").val();
		var myArray = new Array()
		//myArray = $("#pro_ids").val();
		//var a= $("#ids_pro").text();
		$("[name='ids_pro']").each(function() {
			//alert($("[name='ids_pro']").text());
			myArray.push($(this).text());
		})
		//alert(myArray);
		window.location.href = "/shopping/applyOrder?ids=" + myArray;
	}
</script>
</head>
<body>
	<div class="body">
		<table>
			<tr id="address_add">
				<td>
					<div class="address_o" onclick="address(this)">
						（<span>陈莎莎</span> 收）
						<hr />
						<div class="address_text">
							<span>浙江杭州萧山 北干 建村花园 建村花园建村花园 建村花园 建村花园4幢一单元4102</span>
						</div>
					</div>
				</td>
				<td>
					<div class="address" onclick="address(this)">
						（<span>陈莎莎</span> 收）
						<hr />
						<div id="">
							<span>浙江杭州萧山 北干 建村花园 建村花园 建村花园 建村花园 建村花园4幢一单元4102</span>
						</div>
					</div>
				</td>
				<td>
					<div class="address" onclick="address(this)">
						（<span>陈莎莎</span> 收）
						<hr />
						<div>
							<span>浙江杭州萧山 北干 建村花园 建村花园建村花园 建村花园 建村花园4幢一单元4102</span>
						</div>
					</div>
				</td>
				<td>
					<div class="address" onclick="address(this)">
						（<span>陈莎莎</span> 收）
						<hr />
						<div>
							<span>浙江杭州萧山 北干 建村花园 建村花园建村花园 建村花园 建村花园4幢一单元4102</span>
						</div>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="4"><span class="set_address"
					onclick="Jump('add_address.html')">管理收货地址</span></td>
			</tr>
		</table>
		<table class="order_commodity">
			<tr>
				<td colspan="5"><b>确认订单信息</b></td>
			</tr>
			<tr>
				<td class=" head_line"><span>商品</span></td>
				<td class=" head_line"><span></span></td>
				<td class=" head_line"><span>规格</span></td>
				<td class=" head_line"><span>单价</span></td>
				<td class=" head_line"><span>数量</span></td>
				<!-- <td class=" head_line"><span>优惠方式</span></td> -->
				<td class=" head_line"><span>小计</span></td>
			</tr>
		</table>
		<!-- <input id="pro_ids" type="text" value="${proIds}" /> -->
		<c:forEach items="${verfiyOrder}" var="order">
			<table class="order_commodity order_commodity_w">
				<thead>
					<tr class="firm">
						<td colspan="7">
							<div class="firm_w">${order.fac_name}</div>
						</td>
					</tr>
				</thead>
				<c:forEach items="${order.productStandards}" var="a">

					<tbody>
						<tr class="firm_list">
							<td><img src="${a.pic}" width="60px" height="60px" /></td>
							<td style="display: none; width: 20px; height: 0px;"
								name="ids_pro" id="ids_pro">${a.id}</td>
							<td><span>${a.productName}</span></td>
							<td><span class="specifications">${a.spec}</span></td>
							<td><span class="univalent">${a.guidingPrice}</span></td>
							<td><span class="number">${a.num}</span></td>
							<td><span class="subtotal">${a.num*a.guidingPrice}</span></td>
						</tr>
					</tbody>
				</c:forEach>
				<tfoot>
					<tr class="firm">
						<td colspan="7">
							<div style="float: right;">
								共 <span class="company_total_num">0</span> 件商品，小计 <span
									class="company_total"> 158.00 </span>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="7">
							<div style="float: right;">
								<span>(结算总金额大于79元，可免运费)</span> 运费<b class="red total_y yun">￥</b><b
									class="red total_y yun">10.00</b>
							</div>
						</td>
					</tr>
				</tfoot>
			</table>
		</c:forEach>
		<table class="order_commodity">


			<tr>
				<td colspan="5">
					<div style="float: right;">
						店铺合计（含运费）<b class="red">￥</b><b class="red" id="total">52.00</b>
					</div>
				</td>
			</tr>
			<!-- <tr>
				<td colspan="5">
					<div style="float: right;">
						<input type="radio" name="defray" id="" value="" checked="checked" />自己购买
					</div>
				</td>
			</tr> -->

		</table>
		<div class="order_last_box">
			<div class="order_last">
				<p>
					<b>实付款</b><b style="font-size: 25px; color: #666;">￥</b><b
						style="font-size: 25px; color: red;" id="total_two">52.00</b>
				</p>
				<p>
					<b>寄送至：</b><span id="Oaddress_val">萧山 北干 建村花园 建村花园 建村花园 建村花园
						建村花园4幢一单元4102</span>
				</p>
				<p>
					<b>收件人：</b><span id="name_val">陈莎莎</span>
				</p>
			</div>
			<div style="float: left; padding: 10px;"
				onclick="window.location.href='shop.html'">
				<img src="img/back.png" width="20px" height="15px" /> <span
					class="back">返回购物车</span>
			</div>
			<input type="button" name="" class="order_submit" value="提交订单"
				onclick="applyOrder()" />
		</div>
	</div>
</body>
</html>
