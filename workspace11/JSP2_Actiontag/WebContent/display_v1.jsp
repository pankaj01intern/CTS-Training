<%@page import="com.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Employee Data</h1>

<table border=1>
<tr>
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Salary</th>
</tr>

<tr>
	<td>${requestScope.emp.empId} </td>
	<td>${requestScope.emp.empName} </td>
	<td>${requestScope.emp.salary}</td>
</tr>
</table>

</body>
</html>