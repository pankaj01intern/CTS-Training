package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

	public static void main(String[] args) {
  try{
	  
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	  
	  System.out.println("connection established");
  }catch(Exception e){
	  System.out.println("Error "+e);
  }

		
	}

}
