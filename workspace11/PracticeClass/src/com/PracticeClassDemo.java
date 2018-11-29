package com;



final class A{
	   private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class PracticeClassDemo {

	public static void main(String[] args) {
		A a =new A();
		a.setId(100);
		System.out.println(a.getId());

	}

}
