<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Updated Successfully</title>
</head>
<body>
<jsp:include page="/Banner.jsp"/>
<jsp:include page="/Menu.jsp"/>
<form action="ProductController?menu=Update" method="post">

<table rowspacing="5" cellspacing="5" align="center">

<tr>
	<td>Product Id</td>
	<td><input type="text" name="id" value="${product.id}" > </td>
</tr>

<tr>
	<td>Product Name</td>
	<td><input type="text" name="name" value="${product.name}"> </td>
</tr>

<tr>
	<td>Price</td>
	<td><input type="text" name="price" value="${product.price}"> </td>
</tr>

<tr>
	<td>Description</td>
	<td><textarea name="description" >${product.description}</textarea> </td>
</tr>

<tr>
	<th colspan="2"><font color="green">
			${param.msg}
			</font>
	</th>
</tr>

<tr>
	<th colspan="2">
		<input type="submit" value="Update">
		<input type="reset" value="Clear All">
	</th>

</tr>

</table>
</form>

<hr/>


<c:if test="${requestScope.products ne null }">

<table rowspacing="5" cellspacing="5" align="center">

<tr>
	<td>Product Id</td>
	<td>Product Name</td>
	<td>Price</td>
	<td>Description</td>
</tr>

<c:forEach var="product" items="${products}">
	<tr>
	
		<td> ${product.id} </td>
		<td> ${product.name} </td>
		<td> ${product.price} </td>
		<td> ${product.description} </td>
	</tr>

</c:forEach>
</table>


</c:if>

</body>
</html>