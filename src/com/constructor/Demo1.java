package com.constructor;

class Demo1 {
	Demo1(){
		System.out.println("from demo1()");
	}

}
class Mainclass1{
	public static void main(String[] args ) {
		System.out.println("main class starts");
		Demo1 ob1=new Demo1();
		System.out.println("XXXXXXXX");
		Demo1 ob2=new Demo1();
		System.out.println("main class ends");
		
	}
}
