<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加车辆</title>
</head>
<body>
	<form action="car_add.do" method="post">
		<input type="hidden" name="id" value="${car.id }" /><br> <br> 
		<c:if test="${!empty car.id}">
		<input type="hidden" name="carNumber" value="${car.carNumber}"/><br> <br> 
		</c:if>
		<c:if test="${empty car.id}">
		车牌号:<input type="text" name="carNumber" value="${car.carNumber}"/><br> <br> 
		</c:if>
		车辆品牌:<input type="text" name="carName" value="${car.carName}"/><br> <br>
		 客户姓名:<input type="text" name="persenName" value="${car.persenName}"/><br> <br> 
		 电话:<input type="text" name="telephone"  value="${car.telephone}"/><br> <br> 
		 地址:<input type="text" name="address"  value="${car.address}"/><br> <br> 
		 <span><hr></span>
		 <input type="submit" value="确认" />
	</form>
</body>
</html>