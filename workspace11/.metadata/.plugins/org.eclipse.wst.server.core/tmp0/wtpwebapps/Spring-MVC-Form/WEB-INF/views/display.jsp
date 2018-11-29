<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h4 align="center">Product Data</h4>

<br/>
<table align="center">
	<tr>
		<th>Product Id</th>
		<td><input value="${product.prodId }"></td>
		</tr>
		
		<tr>
		<th>Product Name</th>
		<td><input value="${product.prodName }"></td>
		</tr>
		
		<tr>
		<th>Price</th>
		<td><input value="${product.price }"></td>
		</tr>
	
</table>


Select
<select>
    <c:forEach var="item" items="${branches}">
        <option value="${item}">${item}</option>
    </c:forEach>
</select>

</body>
</html>