package com.iib;

class Loan {
String name;
double rateOfInterset;
String loanId;
static int x;
{
	++x;
	loanId="iciciL"+x;
}
Loan(){
}

Loan(String name,double rateOfInterset)
{
	this.name=name;
	this.rateOfInterset=rateOfInterset;}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan1=new Loan();
		loan1.name="vechile loan";
		loan1.rateOfInterset=14;
		System.out.println("loanid"+ loan1.loanId + "name" +loan1.name + "rateOfIntersets"+loan1.rateOfInterset);
		

	}

}
