package com;

public class C1 implements LamdaDemo{
	
	@Override
	public void f1() {
		LamdaDemo.super.f1();
		System.out.println("u r in f1 of C1");
		
	}
	@Override
	public void f2() {
		System.out.println("u r in f2 of c1");
		LamdaDemo.super.f2();
	}
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
