package com.staticmembers;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println(A.i);//0
		A.i=20;
		System.out.println(A.i);//20

	}

}
