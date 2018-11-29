package com.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ProductDaoUtil {
	
	private static Connection con;
	public static Connection getConnection(){
		
	      try{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    if(con==null){
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","password-1");
		    }
			}catch(Exception e)
			{
				System.out.println(e.toString());
			}
		
			return con;
	}
}
