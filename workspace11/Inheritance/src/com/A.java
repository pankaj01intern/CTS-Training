package com;

public class A {
    
	public A(){
		System.out.println("---In class A");
	}
	public static void main(String[] args) {
		C c=new C();
		B b=new B();
		B.main();
	}
}


class B extends A {
    
	public B(){
	System.out.println("---In class B");	
	}
	//@Override
	public static void main(){
		System.out.println("---Overriding main method");
	}
}

class C extends B {
    
	public C(){
	System.out.println("---In class C");
	}
}