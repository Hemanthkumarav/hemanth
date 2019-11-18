package com.staticmembers;

public class Demo3 {
static int i=10;
	public static void main(String[] args) {
		System.out.println(Demo3.i);//10
		Demo3.i=30;
		System.out.println(i);//30
	

	}

}
