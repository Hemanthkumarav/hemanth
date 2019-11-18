package com.iib;

class P4
{
	{
 System.out.println("from iib");
	}

P4()
{
	System.out.println("from p4()");
} 
P4(int i)
{ 
	this();
	System.out.println("from p4(int)");
}
P4(float f) 
{ 
	this(10);
	System.out.println("from P4(float");
}

public static void main(String [ ]args) {
P4 ob1=new P4();
System.out.println("**********");
P4 ob2=new P4(10);
System.out.println("**********");
P4 ob3=new P4(10.0f);
System.out.println("**********");
}

}

