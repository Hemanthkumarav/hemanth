package com.nonstaticmembers;


public class Demo5{
	void m1()
	{
		System.out.println("from m1()");
		}
	public static void mian(String [] args)
	{
			Demo5 x=new Demo5();
			x.m1();
	}

}
