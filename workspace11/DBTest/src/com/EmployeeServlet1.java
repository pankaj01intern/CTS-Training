package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h1>Details has been submitted successfully</h1>");
		
		String empName=request.getParameter("empName");
		String salary=request.getParameter("empSalary");
		String gender=request.getParameter("gender");
		String deptName=request.getParameter("deptName");
		
		DBUtilConn.display(empName,salary,gender,deptName);
		
	}

	
	}


