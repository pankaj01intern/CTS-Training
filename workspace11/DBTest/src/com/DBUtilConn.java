package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBUtilConn {	
		
	public static void display(String empName, String salary, String gender, String deptName){
			
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?useSSL=false","root","root");   
		
				String qry = "insert into employeedetails values(?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(qry);
				ps.setString(1, empName);
				ps.setString(2,salary);
				ps.setString(3,gender);
				ps.setString(4,deptName);

				int x=ps.executeUpdate();

		
			
			
			}catch(Exception e){ System.out.println(e);}  
			
			
	}
}