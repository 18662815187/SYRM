<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="/tags" prefix="date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="renderer" content="webkit" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="../../../plugin/layui-v1.0.7/layui.js"
	type="text/javascript"></script>
<script src="/js/main.js" type="text/javascript"></script>
<link rel="stylesheet" href="../../../plugin/layui-v1.0.7/css/layui.css" />
<link rel="stylesheet" href="../../../css/date.css" />
<title>生医容美全部订单列表</title>
<script type="text/javascript">
//发货
function delivery(Id,pid) {
	//你确定删除吗？
	if (!confirm("你确定发货吗?")) {
		return;
	}
	var url = "/order/deliver.do";
	var params = {
		"id" : Id,
		"pid":pid
	};
	//var params1 = '{"marketPrice" : m,"price" : p,"stock" : s,"upperLimit" : l,"deliveFee" : f,"id" : skuId}';
	//异步保存
	$.post(url, params, function(data) {
		//alert(data.message);
		if(data.message==1){
			alert("发货成功!");
			window.location.href="/order/completed.do?opstyle=2";
		}
		if(data.message==0){
			alert("网络请求失败,请联系管理员!");
			return;
		}
		if(data.message==2){
			alert("没有找到该产品的库存信息!");
			return;
		}
		if(data.message==3){
			alert("订单信息获取失败!");
			return;
		}
		if(data.message==4){
			alert("库存不足，请检查库存!");
			return;
		}
		if(data.message==5){
			alert("库存更新失败，请联系管理员!");
			return;
		}
		if(data.message==6){
			alert("订单状态更新失败，请联系管理员!");
			return;
		}
	}, "json")
}
layui.use([ 'laydate', 'dateLay' ], function() {
	var layer = layui.layer, laydate = layui.laydate;
	var obj = {
		init : function() {
			this.dp11 = $('#dp11');
			this.dp12 = $('#dp12');
			this.initEvent();
		},
		initEvent : function() {
			this.dp11.dateLay();
			this.dp12.dateLay();

		}
	}
	obj.init();
});
</script>
<script type="text/javascript">
	function export_report() {
		var time = $("#dp11").val();
		var tel = $("#tel").val();
		var style = $("#style").val();
		var opstyle = $("#opstyle").val();
		//var phId = ${pid};
		window.location.href = "/exportOrder.do?time="+ time + "&tel="
				+ tel + "&style=" + style + "&opstyle=" + opstyle;
	}
</script>
</head>
<body>
	<div class="box-positon">
		<div class="rpos">当前位置: 订单管理 - 已支付列表</div>
		<div class="clear"></div>
	</div>
	<div class="body-box">
		<form action="/order/AllList.do" method="post"
			style="padding-top: 5px;">
			手机号: <input id="tel" type="text" name="tel" value="${tel}" />&nbsp&nbsp&nbsp
			时间区间：<input type="text" id="dp11" class="ui-time-text" name="time"
				value="${time}" kssj="" jssj="" /> <input id="style" name="style"
				type="hidden" value="" /><input id="opstyle" name="opstyle"
				type="hidden" value="" /> <input type="submit" class="query"
				value="查询" />&nbsp&nbsp&nbsp<span Style="color: red">*根据您的搜索条件导出报表</span>&nbsp&nbsp&nbsp
			<input type="button" class="upload-file" onclick="export_report()"
				value="导出报表" />
		</form>
		<input type="hidden" name="pageNo" value="${pageNo}" />
		<form method="post" id="tableForm">
			<input type="hidden" value="" name="pageNo" /> <input type="hidden"
				value="" name="queryName" />
			<table cellspacing="1" cellpadding="0" border="0" width="100%"
				class="pn-ltable">
				<thead class="pn-lthead">
					<tr>
						<th width="20">ID</th>
						<th>订单号</th>
						<th>产品名称</th>
						<th>品牌名称</th>
						<th>规格</th>
						<th>生产厂商</th>
						<th>数量</th>
						<th>单价</th>
						<th>总金额</th>
						<th>购买人名字</th>
						<th>购买人手机号</th>
						<th>订单状态</th>
						<th>下单时间</th>
						<th>发货状态</th>
						<th>操作选项</th>
					</tr>
				</thead>
				<tbody class="pn-ltbody">
					<c:forEach items="${pagination.list}" var="order">
						<tr bgcolor="#ffffff" onmouseover="this.bgColor='#eeeeee'"
							onmouseout="this.bgColor='#ffffff'">
							<td align="center">${order.orderId}</td>
							<td align="center">${order.orderNum}</td>
							<td align="center">${order.productName}</td>
							<td align="center">${order.brandname}</td>
							<td align="center">${order.spec}</td>
							<td align="center">${order.factoryname}</td>
							<td align="center">${order.num}</td>
							<td align="center">${order.price}</td>
							<td align="center">${order.fee}</td>
							<td align="center">${order.buyername}</td>
							<td align="center">${order.tel}</td>
							<td align="center"><c:if test="${order.style==0}">未支付</c:if>
								<c:if test="${order.style==1}">已支付</c:if> <c:if
									test="${order.style==2}">已完成</c:if> <c:if
									test="${order.style==3}">有退款</c:if> <c:if
									test="${order.style==4}">申请退款</c:if> <c:if
									test="${order.style==5}">已退款</c:if></td>
							<td align="center"><date:date value="${order.addtime} " /></td>
							<td align="center"><c:if
									test="${order.opstyle==0&&order.style==1}">已付款未发货</c:if> <c:if
									test="${order.opstyle==0&&order.style==0}">未付款未发货</c:if> <c:if
									test="${order.opstyle==1}">已发货</c:if> <c:if
									test="${order.opstyle==2}">订单已完成</c:if></td>
							<td align="center"><a
								href="/order/view.do?id=${order.orderId}" class="pn-opt">查看</a>
								<c:if test="${order.style==1&&order.opstyle==0}"> | <a
										onclick="delivery(${order.orderId},${order.pid})"
										href="javascript:void(0);" class="pn-opt">发货</a>
								</c:if></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="page pb15">
				<span class="r inb_a page_b"> <span
					style="font-weight: bold; font-size: 15px;">数据总数 <c:out
							value="${pagination.totalCount}" default="0" /> 条,单页最大显示 <c:out
							value="${pagination.pageSize}" default="0" /> 条.
				</span> &nbsp&nbsp&nbsp <c:forEach items="${pagination.pageView}"
						var="page">
				${page}
				</c:forEach>
				</span>
			</div>
			<div style="margin-top: 15px;">
				<!-- 	<input class="del-button" type="button" value="取消" onclick="optCancel();"/>
	<input class="submit" type="button" value="通过" onclick="optPass();"/> -->
			</div>
		</form>
	</div>
</body>
</html>