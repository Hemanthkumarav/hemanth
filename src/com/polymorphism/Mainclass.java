package com.polymorphism;

public class Mainclass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		A ob;
		ob=new A();
		ob.test();//from test() of A
		ob=new B();//upcasting
		ob.test();//polymorphism//from test() of B

	}

}
