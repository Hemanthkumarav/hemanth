package com.str;

import java.util.ArrayList;

class HetroAll {
	public static void main(String []args) {
		ArrayList hetro=new ArrayList();
		
		hetro.add(new Movie1("kgf",5));
		hetro.add(new Emp1(1,"hhh"));
		hetro.add(10);
		System.out.println(hetro);
	}

}
