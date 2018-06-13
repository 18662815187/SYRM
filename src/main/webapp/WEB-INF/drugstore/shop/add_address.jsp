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
<title>增加地址</title>
<script src="/js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/index.css" />
<style type="text/css">
.body {
	margin: 2em;
}

.body table {
	padding: 5px;
	font-size: 14px;
}

.body table td {
	padding: 5px;
}

.red {
	color: red;
}

.h2-single {
	background-color: #f3f8fe;
	color: #014d7f;
}

.save {
	width: 80px;
	height: 30px;
	color: #fff;
	background-color: #fc6210;
	border: 0px;
	border-radius: 5px;
}

.default {
	border: 2px solid #fc6210;
	background: #ffd6cc;
	color: #f30;
	text-align: center;
	border-radius: 3px;
}

.default_hide {
	
}

.modify {
	color: #2F65BA;
	text-decoration: underline
}

.modify:hover {
	color: #fc6210;
}

.cue {
	color: red;
	margin-left: 15px;
	display: none;
}

.select_address:hover {
	background-color: #f1f1f1;
}

.last_def:hover {
	color: #FC6210;
	text-align:;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		mo()
		for (i = 0; i < $(".select_address").size(); i++) {
			$("#table_add tbody").find(".select_address").eq(i).attr("name", i)
		}
	})
	//假设 设定第一个为默认地址
	function mo() {
		var str = '<div class="default">默认地址</div>'
		$("#table_add").find(".select_address").eq(0).find(".last_def").html(
				str)
	}
	//cue
	function cue(ob) {
		$(ob).parent().find(".cue").fadeIn("fast");
		$(ob).parent().find(".cue").fadeOut("slow");
	}
	//判断 并进行提示提示并修改或者添加
	function save() {
		var sto = $("#save").attr("title")
		if (sto == 1) {
			var obj = $(".select_address[name='1']")
			obj.find("td").eq(0).text($("#name_val").val())
			obj.find("td").eq(1).text($("#address_val").val())
			obj.find("td").eq(2).text($("#email_val").val())
			obj.find("td").eq(3).text($("#telephone_val").val())
			kong()
			obj.attr("name", "0")
			$("#save").attr("title", "0")

		} else if (sto == 0) {

			if ($("#address_val").val() == "") {
				cue("#address_val")
			} else if ($("#name_val").val() == "") {
				cue("#name_val")
			} else if ($("#telephone_val").val() == ""
					|| $("#telephone_val").val().length != 11) {
				cue("#telephone_val")
			} else {
				var address_str = '<tr class="select_address" ><td>'
						+ $("#name_val").val()
						+ '</td><td>'
						+ $("#address_val").val()
						+ '</td><td>'
						+ $("#email_val").val()
						+ '</td><td>'
						+ $("#telephone_val").val()
						+ '</td><td><a class="modify" onclick="modify(this)">修改</a>|<a class="modify" onclick="del(this)">删除</a></td><td class="last_def" onclick="select(this)">设定</div></td></tr>'

				$("#table_add").find("tbody").append(address_str)

				kong()
			}
		}

	}
	//清空val
	function kong() {
		$("#name_val").val("")
		$("#address_val").val("")
		$("#email_val").val("")
		$("#telephone_val").val("")
	}
	//设定为默认地址
	function select(ob) {
		$(".last_def").empty().html("设定")
		$(".last_def").removeClass("ti");
		$(".last_def").addClass("tl");
		str = '<div class="default">默认地址</div>'
		$(ob).html(str)
		$(ob).addClass("ti")
		$(ob).removeClass("tl");
	}
	//删除地址
	function del(ob) {
		var mymessage = confirm("确认删除？");
		if (mymessage == true) {
			$(ob).parents(".select_address").remove()
			mo()
		}
	}
	//修改
	function modify(ob) {
		var q1 = $(ob).parents(".select_address").find("td").eq(0).text()
		var q2 = $(ob).parents(".select_address").find("td").eq(1).text()
		var q3 = $(ob).parents(".select_address").find("td").eq(2).text()
		var q4 = $(ob).parents(".select_address").find("td").eq(3).text()
		$("#address_val").val(q2)
		$("#name_val").val(q1)
		$("#telephone_val").val(q4)
		$("#email_val").val(q3)
		$("#save").attr("title", "1")
		$(ob).parents(".select_address").attr("name", "1")
	}
	//跳转页面
	function Jump(hre) {
		location.href = hre;
	}
	//返回值
	var arri = []
	function complete() {
		var leng = $("#table_add tbody .tl").size()
		var arr1 = []
		var arr2 = []
		var num = 0
		var j = $(".ti").parents(".select_address").attr("name") //默认地址的在第几位
		if (j <= 3) {
			if (leng < 4) {
				for (i = 0; i <= leng; i++) {
					var name2 = $("#table_add tbody tr").eq(i).children('td')
							.eq(0).html()
					var address2 = $("#table_add tbody tr").eq(i)
							.children('td').eq(1).html()
					arr1.push(name2);
					arr2.push(address2);
				}
				num = parseInt(j)
				alert(leng)
			} else {
				var name1 = $(".ti").parents(".select_address").children()
						.eq(0).html()
				var address1 = $(".ti").parents(".select_address").children()
						.eq(1).html()
				arr1.push(name1);
				arr2.push(address1);
				num = 0
				for (i = 0; i <= 3; i++) {
					if (i != j) {
						var name2 = $("#table_add tbody tr").eq(i).children(
								'td').eq(0).html()
						var address2 = $("#table_add tbody tr").eq(i).children(
								'td').eq(1).html()
						arr1.push(name2);
						arr2.push(address2);
					}
				}
			}
		} else {
			var name1 = $(".ti").parents(".select_address").children().eq(0)
					.html()
			var address1 = $(".ti").parents(".select_address").children().eq(1)
					.html()
			arr1.push(name1);
			arr2.push(address1);
			num = 0
			for (i = 0; i < 3; i++) {
				var name2 = $("#table_add tbody tr").eq(i).children('td').eq(0)
						.html()
				var address2 = $("#table_add tbody tr").eq(i).children('td')
						.eq(1).html()
				arr1.push(name2);
				arr2.push(address2);

			}
		}
		localStorage.name = arr1;
		localStorage.address = arr2;
		localStorage.num = num;
		Jump('firm_order.html')
	}
</script>
</head>
<body>
	<div class="body">
		<table>
			<tr>
				<td colspan="3" class="h2-single">收货地址</td>
			</tr>
			<tr>
				<td width="100px" style="color: #fc6210;">新镇收货地址</td>
				<td>邮政编码选填一项, 其余均为必填项</td>
			</tr>
			<tr>
				<td>详细地址<span class="red">*</span></td>
				<td><input id="address_val" type="text" placeholder="这里输入地址"
					size="30" /><span class="cue">请输入详细地址</span></td>
			</tr>
			<tr>
				<td>邮政编码</td>
				<td><input id="email_val" type="text" placeholder="这里输入邮编"
					size="30" /></td>
			</tr>
			<tr>
				<td>收货人姓名<span class="red">*</span></td>
				<td><input id="name_val" type="text" placeholder="这里输入姓名"
					size="30" /><span class="cue">请输入收货者名字</span></td>
			</tr>
			<tr>
				<td>手机号码<span class="red">*</span></td>
				<td><input id="telephone_val" type="text"
					placeholder="这里输入手机号码" size="30" maxlength="11"
					onkeyup="value=value.replace(/[^\d]/g,'')" /><span class="cue">请输入正确的手机号码</span></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" name="保存" id="save" value="保存"
					class="save" title="0" onclick="save()" /></td>
			</tr>
		</table>
		<div
			style="color: #fc6210; font-size: 14px; padding-left: 5px; margin-top: 25px;">
			<span>已保存了<span>2</span>条地址，还能保存12条地址
			</span>
		</div>

		<table id="table_add">
			<thead class="h2-single">
				<tr style="text-align: center;">
					<td>收货人</td>
					<td>详细地址</td>
					<td>邮编</td>
					<td>电话/手机</td>
					<td>操作</td>
					<td><div class="">默认地址</div></td>
				</tr>
			</thead>
			<tbody>
				<tr class="select_address" name="0">
					<td>徐顺望1</td>
					<td>浙江省 杭州市 萧山区 北干街道家乐公寓4幢一单元901</td>
					<td>311200</td>
					<td>15*******43</td>
					<td><a class="modify" onclick="modify(this)">修改</a>|<a
						class="modify" onclick="del(this)">删除</a></td>
					<td class="last_def ti" onclick="select(this)">设定
						</div>
					</td>
				</tr>
				<tr class="select_address " name="0">
					<td>徐顺望2</td>
					<td>浙江省 杭州市 萧山区 北干街道家乐公寓4幢一单元901</td>
					<td>311200</td>
					<td>15*******43</td>
					<td><a class="modify" onclick="modify(this)">修改</a>|<a
						class="modify" onclick="del(this)">删除</a></td>
					<td class="last_def tl" onclick="select(this)">设定
						</div>
					</td>
				</tr>
				<tr class="select_address" name="0">
					<td>徐顺望3</td>
					<td>浙江省 杭州市 萧山区 北干街道家乐公寓4幢一单元901</td>
					<td>311200</td>
					<td>15*******43</td>
					<td><a class="modify" onclick="modify(this)">修改</a>|<a
						class="modify" onclick="del(this)">删除</a></td>
					<td class="last_def tl" onclick="select(this)">设定
						</div>
					</td>
				</tr>
				<tr class="select_address" name="0">
					<td>徐顺望4</td>
					<td>浙江省 杭州市 萧山区 北干街道家乐公寓4幢一单元901</td>
					<td>311200</td>
					<td>15*******43</td>
					<td><a class="modify" onclick="modify(this)">修改</a>|<a
						class="modify" onclick="del(this)">删除</a></td>
					<td class="last_def tl" onclick="select(this)">设定
						</div>
					</td>
				</tr>
				<tr class="select_address" name="0">
					<td>徐顺望5</td>
					<td>浙江省 杭州市 萧山区 北干街道家乐公寓4幢一单元901</td>
					<td>311200</td>
					<td>15*******43</td>
					<td><a class="modify" onclick="modify(this)">修改</a>|<a
						class="modify" onclick="del(this)">删除</a></td>
					<td class="last_def tl" onclick="select(this)">设定
						</div>
					</td>
				</tr>
			</tbody>
		</table>

		<div
			style="padding: 3px; border-radius: 3px; color: #2F65BA; font-size: 14px; background-color: #f3f8fe">
			<a href="#" onclick="complete()"> <img src="img/back.png"
				width="15px" height="15px" /> 返回订单确认页
			</a>
		</div>
	</div>
</body>
</html>
