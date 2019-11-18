package com.constructor;

class Demo2 {
	Demo2(boolean b){
		System.out.println("from demo2(boolean)");
	}

}
class Mainclass2{
	public static void main(String[] args ) {
		System.out.println("main class starts");
		Demo2 ob1=new Demo2(true);
		System.out.println("XXXXXXXX");
		Demo2 ob2=new Demo2(true);
		System.out.println("main class ends");
		
	}
}

