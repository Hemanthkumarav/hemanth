package com.nonstaticmembers;

public class Demo2 {
	int i;
	boolean flag;
	public static void main(String[] args)
	{
		System.out.println(new Demo2());
		System.out.println(new Demo2());
		Demo2 a=new Demo2();
		System.out.println(a.i);
		System.out.println(a.flag);
		a.i=10;
		a.flag=true;
		System.out.println(a.i);
		System.out.println(a.flag);
	}

}
