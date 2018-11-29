package com;

public interface LamdaDemo {
	
	int add(int x,int y);
	
	default void f1(){
		System.out.println("Hi u r in f1 of Lamda");
	}

	default void f2(){
		System.out.println("Hi u r in f2 of Lamda");
	}
}
