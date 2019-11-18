package com.str;

import java.util.ArrayList;

class HetroAll {
	public static void main(String []args) {
		ArrayList<E> hetro=new ArrayList();
		hetro.add(new Bike("orange",56));
		hetro.add(new Movie("kgf",56));
		hetro.add(new Emp(1,"hhh"));
		hetro.add(10);
		System.out.println(hetro);
	}

}
