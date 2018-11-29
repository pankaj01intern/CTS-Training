<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>
<jsp:include page="/Banner.jsp"/>
<jsp:include page="/Menu.jsp"/>
<form action="ProductController?Menu=add" method="post">

<table rowspacing="5" cellspacing="5" align="center">

<tr>
	<td>Product Id</td>
	<td><input type="text" name="id"> </td>
</tr>

<tr>
	<td>Product Name</td>
	<td><input type="text" name="name"> </td>
</tr>

<tr>
	<td>Price</td>
	<td><input type="text" name="price"> </td>
</tr>

<tr>
	<td>Description</td>
	<td><textarea name="description"></textarea> </td>
</tr>
<tr>
<th colspan="2"><font color="green">
${param.msg}
</font>
</th>
</tr>


<tr>
	<th colspan="2">
		<input type="submit" value="Save">
		<input type="reset" value="Clear All">
	</th>

</tr>

</table>
</form>

<hr/>


</body>
</html>