package com.staticmembers;

public class Demo7 {
	static int i;
	static 
	{
		System.out.println("from sib of demo7");
		
	}
public static void main(String[] args) {
	System.out.println("from main of demo7");
	System.out.println(Demo8.j);
}
}
