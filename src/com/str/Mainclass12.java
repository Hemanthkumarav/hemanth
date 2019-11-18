package com.str;

class Mainclass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp ob1=new Emp(2,"gggggg",100000);
		Tester ob2=new Tester(1,"girish",2000000,"selenium");
		Develpoers ob3=new Develpoers(2,"kumar",2000,"cplus");
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println(ob1.equals(ob2));
		//System.out.println(ob2.equals(ob3));
		

	}

}
