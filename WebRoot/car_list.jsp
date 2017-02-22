<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>车辆信息表</title>
</head>
<body>
	<table width="80%" border="0" bgcolor="#cccccc">
		<tr>
			<td>车牌号</td>
			<td>车品牌</td>
			<td>客户姓名</td>
			<td>电话</td>
			<td>地址</td>
			<td colspan="2">操作</td>
		</tr>
		<%
			String color = "";
			int c = 1;
		%>
		<c:forEach items="${carLists}" var="car">

			<%
				if (c == 1) {
						color = "#ffffff";
						c = 0;
					} else {
						color = "#f5f5f5";
						c = 1;
					}
			%>
			<tr bgcolor="<%=color%>">
				<td>${car.carNumber}</td>
				<td>${car.carName}</td>
				<td>${car.persenName}</td>
				<td>${car.telephone}</td>
				<td>${car.address}</td>
				<td><a href="./car_delete.do?id=${car.id }">删除</a></td>
				<td><a href="./car_update.do?id=${car.id }">修改</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>