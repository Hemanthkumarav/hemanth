package com.upcasting;

class Mainclass1 {

	public static void main(String[] args) {
		B1 ob1=new C1();
		System.out.println(ob1.i);
		System.out.println(ob1.j);
		A1 ob3= ob1;
		System.out.println(ob3.i);
		
		
		A1 ob2= new C1();
		System.out.println(ob2.i);
//	System.out.println(ob3.j);
//	System.out.println(ob3.k);
		// TODO Auto-generated method stub

	}

}
