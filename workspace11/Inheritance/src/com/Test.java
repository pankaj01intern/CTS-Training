package com;


public class Test {

	public static Test getObject(){
	
		Test t=new C1();
		return t;

	}

}
class C1 extends Test{
	public static void main(String[] args) {
		C1 c1=(C1) Test.getObject();
		System.out.println("---Completed");
		
	
			System.out.println(Integer.parseInt("2147483648", 10));
		
		
		
		
		boolean n=false;
		if(n == false)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
	
	
}
