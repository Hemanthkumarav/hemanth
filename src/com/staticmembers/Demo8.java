package com.staticmembers;

public class Demo8
{	
	static boolean j;
	static
	{
		System.out.println("from static method m1 if demo8");
	}
	public static void main(String[] args)
	{
		System.out.println("from main of demo8");
		
		System.out.println(Demo7.i);
		}
	}
	