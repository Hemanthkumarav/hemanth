package com.polymorphism;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank bank;
bank=new ICICIBank();
System.out.println(bank.rateOfInterset());
bank=new CanaraBank();
System.out.println(bank.rateOfInterset());
bank=new SBITouch();
System.out.println(bank.rateOfInterset());
bank=new SBIBank();
System.out.println(bank.rateOfInterset());
bank=new Bank();
System.out.println(bank.rateOfInterset());

	}

}
