<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body>

<jsp:include page="/Banner.jsp"/>
<jsp:include page="/Menu.jsp"/>
<form action="ProductController?Menu=FindDelete" method="post">

<table align="center">

<tr>
	<th>Product Id</th>
	<td><input type="text" name="id">
</tr>

<tr>
	<th colspan="2">
		<input type="submit" value="Delete">
	</th>
</tr>
<tr>
<th colspan="2"><font color="red">
${param.msg}
</font>
</th>
</tr>

</table>
</form>

</body>
</html>