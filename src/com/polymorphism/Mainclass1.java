package com.polymorphism;

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank[] B=new Bank[5];
		B[0]=new ICICIBank();
		B[1]=new CanaraBank();
		B[2]=new SBIBank();
		B[3]=new SBITouch();
		B[4]=new Bank();
		for(Bank bank:B)
		{
			System.out.println(bank.rateOfInterset());
		}
		
			

	}

}
