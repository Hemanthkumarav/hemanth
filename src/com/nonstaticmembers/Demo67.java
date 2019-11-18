package com.nonstaticmembers;

class Demo67 {
	int i;
	void test()
	{
		System.out.println(i);
		i=20;
		System.out.println(this.i);
		
	}
	public static void main(String args[])
	

	{
		Demo67 obj1=new Demo67();
		System.out.println(obj1.i);
		obj1.test();
	}
	

}
