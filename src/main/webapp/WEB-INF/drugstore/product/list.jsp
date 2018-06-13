<!-- <%@page import="com.lwyykj.core.bean.product.ProductStandard"%> -->
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>生医容美已审核产品列表</title>
<script type="text/javascript">
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
	function optDelete(uid,name, brandId, pageNo) {
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
						+ "&pageNo=" + pageNo+"&uid="+uid);
		$("#jvForm").attr("method", "post").submit();
	}
</script>
</head>
<body>
	<div class="box-positon">
		<div class="rpos">当前位置: 已审核产品 - 列表</div>
		<form class="ropt">
			<input class="add" type="button" value="添加"
				onclick="window.location.href='/Pvc/toAdd.do'" />
		</form>
		<div class="clear"></div>
	</div>
	<div class="body-box">
		<form action="/spf/list.do" method="post"
			style="padding-top: 5px;">
			名称: <input type="text" name="name" value="${name}" /> <select
				name="brandId">
				<option value="">请选择品牌</option>
				<c:forEach items="${brands}" var="brand">
					<option value="${brand.id}"
						<c:if test="${brandId == brand.id}">selected="selected"</c:if>>${brand.brandname}
					</option>
				</c:forEach>
			</select> 
			<input type="submit" class="query" value="查询" />
		</form>
		<form id="jvForm">
			<table cellspacing="1" cellpadding="0" width="100%" border="0"
				class="pn-ltable">
				<thead class="pn-lthead">
					<tr>
						<th width="20"><input type="checkbox"
							onclick="Pn.checkbox('ids',this.checked)" /></th>
						<th>产品编号</th>
						<th>产品名称</th>
						<th>图片</th>
						<th>规格</th>
						<th>品牌</th>
						<th>厂家</th>
						<th>厂商指导价</th>
						<th>本店价格</th>
						<th>库存数量</th>
						<th width="12%">操作选项</th>
					</tr>
				</thead>
				<tbody class="pn-ltbody">
					<c:forEach items="${pagination.list}" var="product">
						<tr bgcolor="#ffffff" onmouseover="this.bgColor='#eeeeee'"
							onmouseout="this.bgColor='#ffffff'">
							<td align="center"><input type="checkbox" name="ids"
								value="${product.id}" /></td>
							<td align="center">${product.proId}</td>
							<td align="center">${product.productName}</td>
							<td align="center"><img width="50" height="50" src="${product.pic}" onerror="javascript:this.src='/img/error.jpg'"/></td>
							<td align="center">${product.spec}</td>
							<td align="center">${product.brandName}</td>
							<td align="center">${product.factoryName}</td>
							<td align="center">${product.guidingPrice}</td>
							<td align="center">${product.price}</td>
							<td align="center">${product.stock}</td>
							<td align="center">
							<!--<a href="#" class="pn-opt">查看</a> |   -->
							<a href="/shopping/toProList?id=${product.supBrand.supId}"  class="pn-opt">申请补货</a> 
								| <a href="/sku/list.do?id=${product.id}" class="pn-opt">库存管理</a> | <a href="/spf/delete?id=${product.id}&uid=${pid}&pageNo=${pagination.pageNo}&brandId=${brandId}&name=${name}"
								onclick="if(!confirm('您确定删除吗？')) {return false;}" class="pn-opt">删除</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="page pb15">
			
				<span class="r inb_a page_b"> 
				<span style="font-weight:bold;font-size:15px;">数据总数  ${pagination.totalCount}  条,单页最大显示  ${pagination.pageSize}  条. </span> &nbsp&nbsp&nbsp
				<c:forEach
						items="${pagination.pageView}" var="page">
				${page}
				</c:forEach>
				</span>
			</div>
			<div style="margin-top: 15px;">
				<input class="del-button" type="button" value="删除"
				onclick="optDelete('${pid}','${name}','${brand.id}','${pagination.pageNo}');" />
			</div>
		</form>
	</div>
</body>
</html>