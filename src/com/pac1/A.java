package com.pac1;

class A {
	private static int i=10;
	private int j;
	public static void main(String[] args) {
		System.out.println(i);//0
		A ob=new A();
		System.out.println(ob.j);//0
	}
	
	

}
