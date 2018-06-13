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
<title>购物车</title>
<script src="js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<link rel="stylesheet" type="text/css" href="css/shop.css" />
<script type="text/javascript">
	$(document).ready(function() {
		//给ul赋予值
		for (i = 0; i <= $("body").find("ul").length; i++) {
			$("body").find("ul").eq(i).attr("name", i)
		}
		//给li赋予值
		oli()
		//判断是否选中
		$(".choice").change(function() {
			if ($(this).is(':checked')) {
				$(this).attr("checked", true)
			} else {
				$(this).attr("checked", false)
			}

			aggregate()
		})
		aggregate()
	})
	//判断是否产商下全选
	function box(ob) {

		for (j = 0; j <= $(".body").find("ul").index(); j++) {
			var pp = 0
			for (i = 1; i <= $("ul[name='" + j + "']").find("li").index(); i++) {
				var o = $("ul[name='" + j + "']").find("li[name='" + i + "']")
				if (o.find(".choice").is(':checked')) {
					pp++
					o.attr("title", "22")
				} else {
					o.attr("title", "11")
				}
			}
			if (pp == $("ul[name='" + j + "']").find("li").index()) {
				$(".body").find("ul[name='" + j + "']").find(".factory_choice")
						.attr("checked", "true");
			} else {
				$(".body").find("ul[name='" + j + "']").find(".factory_choice")
						.removeAttr("checked");
			}
		}
	}

	//是否跳转
	function zero_j() {
		if ($("#aggregate").text() == 0.00) {
			alert('请勾选需要结算的商品')
		} else {
			var myArray = new Array()
			$("[name='id'][checked]").each(function() {
				myArray.push($(this).val());
			})
			//alert(myArray);
			window.location.href = "/shopping/verfiyOrder?ids=" + myArray
			+ "&returnUrl=" + encodeURIComponent(window.location.href);

		}
	}
	//判断是否有价格
	function zero() {
		if ($("#aggregate").text() == 0.00) {
			$("#settle").css("background-color", "#B0B0B0").attr('disabled',
					true);
		} else {
			$("#settle").css("background-color", "#2f65ba").attr('disabled',
					false);
		}
	}
	//给li重新计数
	function oli() {
		var myarray = new Array()
		for (j = 0; j <= $(".body").find("ul").index(); j++) {
			for (i = 0; i <= $("ul[name='" + j + "']").find("li").index(); i++) {
				$("ul[name='" + j + "']").find("li").eq(i).attr("name", i)
				$("ul[name='" + j + "']").find("li").eq(i).attr("title", "11")
			}
		}

	}
	//判断是否还存在厂商
	function exist() {
		for (i = 0; i <= $("body").find("ul").length; i++) {
			if ($("body").find("ul").eq(i).children().length <= 1) {
				$("body").find("ul").eq(i).children().eq(0).remove()
			}
		}
	}
	//总计
	function aggregate() {
		var aa = new Array()
		var aa_and = 0
		for (j = 0; j <= $(".body").find("ul").index(); j++) {
			for (i = 0; i <= $("body").find("li").index() * 2; i++) {
				aa[i] = $("ul[name='" + j + "']").find("li[name='" + i + "']")
						.find(".subtotal").text()
				if (aa[i]!=""&&$("ul[name='"+j+"']").find("li[name='"+i+"']").find(".choice").attr("checked")) {
					aa_and = aa_and + Number(aa[i])
				}
			}
		}

		$("#aggregate").text(aa_and.toFixed(2))
		zero()
	}
	//加减
	function omin(va, ob) {

		num = $(ob).parents("li").attr("name")
		numl = $(ob).parents("ul").attr("name")
		var Oval = $("ul[name='" + numl + "']").find("li[name='" + num + "']")
				.find("input[type='text']")

		if (va == 0) {
			if (Oval.val() > 1) {
				Oval.val(parseInt(Oval.val()) - 1)
			}
		} else if (va == 1) {
			Oval.val(parseInt(Oval.val()) + 1)
		}
		//小计
		var Osubtotal = $("ul[name='" + numl + "']").find(
				"li[name='" + num + "']").find(".univalent").text()
		var Osubtotal_text = (Osubtotal * Oval.val()).toFixed(2)
		$("ul[name='" + numl + "']").find("li[name='" + num + "']").find(
				".subtotal").text(Osubtotal_text)
		//
		aggregate()
		exist()
	}
	//单商品删除
	function del(ob) {
		num = $(ob).parents("li").attr("name")
		numl = $(ob).parents("ul").attr("name")
		$("ul[name='" + numl + "']").find("li[name='" + num + "']").remove()
		aggregate()
		oli()
	}
	//删除提示
	function rec(ob) {
		var mymessage = confirm("确认删除？");
		if (mymessage == true) {
			del(ob)
		}
		exist()
	}
	//厂商选择
	function factory(ob) {
		if ($(ob).is(':checked')) {
			$(ob).parents("ul").find(".choice").attr({
				"checked" : "true",
				"title" : "1"
			});

		} else {
			$(ob).parents("ul").find(".choice").removeAttr("checked");
			$(ob).parents("ul").find(".choice").attr("title", "0");
		}
		;
		aggregate()
		box(ob)
	}
	//全选
	function whole() {
		if ($("#whole_choice").is(':checked')) {
			$(".choice").attr({
				"checked" : "true",
				"title" : "1"
			});
			$("li").attr("title", 22) //22选中
		} else {
			$(".choice").removeAttr("checked");
			$(".choice").attr("title", "0");
			$("li").attr("title", 11) //11未选中
		}
		;
		aggregate()
	};
	//选中删除
	function whole_del() {
		var myArray = new Array()
		for (j = 0; j <= $(".body").find("ul").index(); j++) {
			for (i = 0; i <= $("ul[name='" + j + "']").find("li").index(); i++) {
			}
		}
		$("li[title='22']").remove()
		//重新计算
		oli()
		//判断产商
		exist()
		//计价
		aggregate()

	}
	//跳转
	function Jump(hre) {
		location.href = hre;
	}
</script>
</head>
<body>
	<div class="head">
		<div class="dark"></div>
		<div class=""></div>
	</div>
	<div class="body">
		<div>
			<c:forEach items="${buyerCart}" var="a">
				<ul class="shop_list">
					<li>
						<div class="factory">
							<input type="checkbox" name="" class="factory_choice choice"
								onclick="factory(this)" /> <span
								style="background-color: #E5E5E5; padding: 3px 10px;">${a.fac_name}</span>
						</div>
					</li>
					<c:forEach items="${a.buyerItems}" var="b">
						<li>
							<table>
								<tr>
									<td rowspan="2" width="13px"><input type="checkbox"
										class="choice" name="id" value="${b.proCart.pro_id}"
										onclick="box(this)" /></td>
									<td rowspan="2" width="13px"><img
										src="${b.productStandard.pic}" /></td>
									<td width="35%"><span>${b.productStandard.productName}</span></td>
									<td>￥<span class="univalent">${b.productStandard.guidingPrice}</span></td>
									<td width="75px">
										<div
											style="border: 1px solid #CDCDCD; height: 27px; width: 72px;">
											<input type="button" name="min" id="omin" class="omin an"
												value="-" onclick="omin(0,this)" /> <input id="val"
												class="val" type="text" placeholder="1" value="${b.amount}" />
											<input type="button" name="max" id="omax" class="omax an"
												value="+" onclick="omin(1,this)" />
										</div>
									</td>
									<td width="125px">￥<span class="subtotal">${b.productStandard.guidingPrice*b.amount}</span></td>
									<td class="delete" onclick="rec(this)">删除</td>
								</tr>
								<tr>
									<td colspan="5">${b.productStandard.spec}</td>
								</tr>
							</table>
						</li>
					</c:forEach>
				</ul>
			</c:forEach>
		</div>
		<div>
			<table
				style="border: 1px solid #CDCDCD; padding-left: 10px; margin-top: 10px;">
				<tr>
					<td width="50px"><input type="checkbox" name=""
						id="whole_choice" onclick="whole()" /> <span>全选</span></td>
					<td width="60px"><span class="whole_delete"
						onclick="whole_del()">删除</span></td>
					<td></td>
					<td style="float: right; margin: 5px;">合计：<span
						style="color: red; font-size: 20px;" id="aggregate">50000.00</span></td>
					<td width="100px"><div id="settle" onclick=" zero_j()"
							style="text-align: center; height: 40px; background-color: #2f65ba; color: #fff; line-height: 40px">结算</div></td>
				</tr>
			</table>
		</div>
	</div>
	</div>
</body>
</html>
