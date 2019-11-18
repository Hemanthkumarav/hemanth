package com.constructor;

class Demo3 {
	Demo3( int b){
		System.out.println(b);
	}

}
class Mainclass3{
	public static void main(String[] args ) {
		System.out.println("main class starts");
		Demo3 ob1=new Demo3(10);
		System.out.println("XXXXXXXX");
		
	}
}

