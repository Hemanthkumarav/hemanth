package com.pac1;

public class C extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(C.i);//i is private hence is not inhirited
		C ob =new C();
		System.out.println(ob.j);//j is private hence is not inhirited

	}

}
