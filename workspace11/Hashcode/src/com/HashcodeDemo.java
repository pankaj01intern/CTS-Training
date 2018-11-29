package com;

public class HashcodeDemo {

	int id;
	String name;
	public static void main(String[] args) {
		HashcodeDemo hs=new HashcodeDemo();
		
		System.out.println(hs.hashCode());
		System.out.println(System.identityHashCode(hs ));

	}

}
