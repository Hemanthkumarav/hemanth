package com.abstractn;

class Jungle {

	public static void main(String[] args) {
		Animal a;
		a=new Dog(12,34);
		a.talk();
		System.out.println(a.height +   "    "+ a.weight);

	}

}
