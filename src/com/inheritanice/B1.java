package com.inheritanice;

class B1  extends A1{
	static int i=100;
	int j=200;
	static {
		System.out.println("from sib of b");
	}
	B1()
	{
		System.out.println("from iii of b");
	}
	{
 System.out.println("from b");
}
}
