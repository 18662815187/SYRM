<!-- <%@page import="com.lwyykj.core.bean.product.ProductStandard"%> -->
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>生医容美已审核产品列表</title>
<script type="text/javascript">
window.pageConfig = {
		compatible : true,
		product : {
			skuid : 1221882,
			name : '\u957f\u8679\uff08\u0043\u0048\u0041\u004e\u0047\u0048\u004f\u004e\u0047\uff09\u004c\u0045\u0044\u0034\u0032\u0035\u0033\u0038\u0045\u0053\u0020\u0034\u0032\u82f1\u5bf8\u0020\u7a84\u8fb9\u84dd\u5149\u004c\u0045\u0044\u6db2\u6676\u7535\u89c6\uff08\u9ed1\u8272\uff09',
			skuidkey : 'E804B1D153D29E36088A33A134D85EEA',
			href : 'http://item.jd.com/1221882.html',
			src : 'jfs/t304/157/750353441/93159/e4ee9876/54227256N20d4f5ec.jpg',
			cat : [ 737, 794, 798 ],
			brand : 20710,
			nBrand : 20710,
			tips : false,
			type : 1,
			venderId : 0,
			shopId : '0',
			TJ : '0',
			specialAttrs : [ "HYKHSP-0", "isHaveYB", "isSelfService-0",
					"isWeChatStock-0", "isCanUseJQ", "isOverseaPurchase-0",
					"YuShou", "is7ToReturn-1", "isCanVAT" ],
			videoPath : '',
			HM : '0'
		}
	};
	//上架
	function isShow() {
		//请至少选择一个
		var size = $("input[name='ids']:checked").size();
		if (size == 0) {
			alert("请至少选择一个");
			return;
		}
		//你确定吗
		if (!confirm("你确定上架吗")) {
			return;
		}
		//提交 Form表单
		$("#jvForm").attr("action", "/product/isShow.do");
		$("#jvForm").attr("method", "post");
		$("#jvForm").submit();

	}
	//下架
	function unShow() {
		//请至少选择一个
		var size = $("input[name='ids']:checked").size();
		if (size == 0) {
			alert("请至少选择一个");
			return;
		}
		//你确定吗
		if (!confirm("你确定下架吗")) {
			return;
		}
		//提交 Form表单
		$("#jvForm").attr("action", "unshow.do");
		$("#jvForm").attr("method", "post");
		$("#jvForm").submit();
	}
	function optDelete(uid, name, brandId, pageNo) {
		//请至少选择一个,只取被选中的，使用checked区分,判断长度是否为0，如为0提示至少选一个
		//alert(1);
		var size = $("input[name=ids]:checked").size();
		if (size == 0) {
			alert("请至少选择一个");
			return;
		}
		//你确定删除吗？
		if (!confirm("你确定删除吗?")) {
			return;
		}
		$("#jvForm").attr(
				"action",
				"/spf/deletes.do?name=" + name + "&brandId=" + brandId
						+ "&pageNo=" + pageNo + "&uid=" + uid);
		$("#jvForm").attr("method", "post").submit();
	}
	//加入购物车，原页面跳转不开新页面
	function addCart(pro_id,amount){
		//alert(parseInt(amount));
		window.location.href = '/shopping/addToCart?pro_id=' + pro_id
				+ "&amount=" + amount;
	}
	//jq
	function omin(obj){
		var Oval =$("#"+obj).val;
		if(Oval>1){
		$(ob).parent().find("#"+obj).val(Oval-1);
		}
	}
</script>
<script type="text/javascript">
function a1(obj){
	var a =$("#val"+obj).val();
	if(a>1){
		$("#val"+obj).val(a-1);
	}
}
function a2(obj){
	var b=parseInt($("#val"+obj).val());
	$("#val"+obj).val(b+1);
}
</script>
<script type="text/css">
.number{
	background-color: red;
	width: 13px;
	height: 13px;
	border-radius:20px ;
	padding:3px ;
	color: #FFFFFF;
	font-size:10px;
	position: absolute;
	top: -8px;
	left: -8px;
	text-align: center;
}
</script>
</head>
<body>
	<div class="box-positon">
		<div class="rpos">当前位置: 已审核产品 - 列表</div>
		<form class="ropt">
			<!--<input class="btnTest" type="button"
				style="background: url(../img/shop.png) no-repeat center red; height: 25px; width: 100px; border-top-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-left-width: 0px; border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-left-style: solid; cursor: pointer; border-radius: 2px; border: 1px solid #9dabb7"
				value="" onclick="window.location.href='/Pvc/toAdd.do'" />  -->
			<div style="position: relative;">
				<input class="btnTest" type="button"
					style="background: url(../img/shop.png) no-repeat center red; height: 25px; width: 100px; border-top-width: 0px; border-right-width: 0px; border-bottom-width: 0px; border-left-width: 0px; border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-left-style: solid; cursor: pointer; border-radius: 2px; border: 1px solid #9dabb7"
					value="" onclick="window.location.href='/shopping/toCart'" />
				<div class="number" id="number"
					style="background-color: red; width: 13px; height: 13px; border-radius: 20px; padding: 3px; color: #FFFFFF; font-size: 10px; position: absolute; top: -8px; left: -8px; text-align: center;"></div>
			</div>
		</form>
		<div class="clear"></div>
	</div>
	<div class="body-box">
		<form action="/spf/list.do" method="post" style="padding-top: 5px;">
			名称: <input type="text" name="name" value="${name}" /> <input
				type="submit" class="query" value="查询" />&nbsp&nbsp&nbsp&nbsp<span
				style="color: red">*此页显示的产品为您在前一页点击行产品所属供应商的所有产品，价格为零售价，您的结算价格按照供应商跟您的约定结算。</span>
		</form>
		<form id="jvForm">
			<table cellspacing="1" cellpadding="0" width="100%" border="0"
				class="pn-ltable">
				<thead class="pn-lthead">
					<tr>
						<!-- <th width="20"><input type="checkbox"
							onclick="Pn.checkbox('ids',this.checked)" /></th> -->

						<th>ID</th>
						<th>产品名称</th>
						<th>规格</th>
						<th>品牌</th>
						<th>厂家</th>
						<th>供应商</th>
						<th>零售价</th>
						<th>订购数量</th>
						<th width="12%">操作选项</th>
					</tr>
				</thead>
				<tbody class="pn-ltbody">
					<c:forEach items="${pagination.list}" var="product">
						<tr bgcolor="#ffffff" onmouseover="this.bgColor='#eeeeee'"
							onmouseout="this.bgColor='#ffffff'">

							<!--<td align="center"><input type="checkbox" name="ids"
								value="${product.skuId}" /></td> -->

							<td align="center">${product.skuId}</td>
							<td align="center">${product.proName}</td>
							<td align="center">${product.spec}</td>
							<td align="center">${product.brandName}</td>
							<td align="center">${product.facName}</td>
							<td align="center">${product.supName}</td>
							<td align="center">${product.guidingPrice}</td>
							<td align="center"><div
									style="border: 1px solid #CDCDCD; height: 23px; width: 80px;">
									<input type="button" style="width: 20px" name="min" id="omin"
										class="omin an" value="-" onclick="a1(${product.proId})" /> <input
										id="val${product.proId}" class="val" type="text"
										placeholder="0" style="width: 30px; text-align: center"
										value="1" /> <input type="button" name="max" id="omax"
										style="width: 20px" class="omax an" value="+"
										onclick="a2(${product.proId})" />
								</div></td>
							<td align="center">
								<!--<a href="#" class="pn-opt">查看</a> |   --> <a href="#"
								class="pn-opt"
								onclick="addCart(${product.proId},$('#val${product.proId}').val())">加入购物车</a>

							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="page pb15">

				<span class="r inb_a page_b"> <span
					style="font-weight: bold; font-size: 15px;">数据总数
						${pagination.totalCount} 条,单页最大显示 ${pagination.pageSize} 条. </span>
					&nbsp&nbsp&nbsp <c:forEach items="${pagination.pageView}"
						var="page">
				${page}
				</c:forEach>
				</span>
			</div>
			<!-- <div style="margin-top: 15px;">
				<input class="del-button" type="button" value="删除"
					onclick="optDelete('${pid}','${name}','${brand.id}','${pagination.pageNo}');" />
			</div> -->

		</form>
	</div>
</body>
</html>