package com.pac1;

class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.i);//CTE IS private not visible beyond same class
		A ob=new A();
		System.out.println(ob.j);// j is not visible outside class A

	}

}
