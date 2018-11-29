<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h3 align="center">Car and Customers Data</h3>

<br/>
<table align="center">
<tr>
 Select
<select>
    <c:forEach var="item" items="${data}">
       
         <option value="${data.key}">${data.value}</option>
    </c:forEach>
</select>
</tr>

</table>


</body>
</html>