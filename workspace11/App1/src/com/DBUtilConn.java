package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUtilConn {	
		
	public static void display(String empName, String salary, String gender, String deptName){
			
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");   
			Statement stmt=con.createStatement(); 
			
				String sql=	String.format("insert into employeedetails values('%s', '%s','%s','%s')",empName,salary,gender,deptName);
			int rs=stmt.executeUpdate(sql);  
			
			}catch(Exception e){ System.out.println(e);}  
			
			
	}
}