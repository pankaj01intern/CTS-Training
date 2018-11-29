package com;

public class Main {

	public static void main(String[] args) {
		LamdaDemo l=(int x,int y)-> x+y;
		
		System.out.println(l.add(107666660,200));
		LamdaDemo l2=new C1();
		l2.f1();
		l2.f2();
		l.f1();
        l.f2();		

	}

}
