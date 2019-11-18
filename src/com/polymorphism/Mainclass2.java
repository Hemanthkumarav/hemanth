package com.polymorphism;

class Mainclass2 {
	static void display(Bank bank)
	{
		System.out.println(bank.rateOfInterset());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1;
		b1=new ICICIBank();
		display(b1);

	}

}
