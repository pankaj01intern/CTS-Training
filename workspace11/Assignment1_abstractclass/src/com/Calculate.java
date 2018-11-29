package com;

import java.util.Scanner;

class Calculate{
	
    //public Solution output=new Solution();
	Scanner sc=new Scanner(System.in);
	public int getINTVal(){
		int integer_val=sc.nextInt();
		return integer_val;
	}
	public double getDoubleVal(){
		double double_val=sc.nextDouble();
		return double_val;
	}
			
	public static Solution get_Vol(){
		return new Solution();
		
	}	
	
}

