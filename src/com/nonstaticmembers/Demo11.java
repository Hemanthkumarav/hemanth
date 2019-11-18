package com.nonstaticmembers;

public class Demo11{
	void m1()
	{
		System.out.println("from m1()");
		}
	public static void mian(String [] args)
	{
			Demo11 x=new Demo11();
			x.m1();
	}

}
