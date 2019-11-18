package com.nonstaticmembers;

class Demo66 {
	void m1() {
		System.out.println("from m1()");
		System.out.println(this);
	}

	public static void main(String[] args) {
	System.out.println("from main of demo5()");
	Demo66 x=new Demo66();
	System.out.println(x);
	x.m1();
	System.out.println("end main");

	}

}
