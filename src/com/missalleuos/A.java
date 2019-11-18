package com.missalleuos;

class A {
int i;
double j;
A(int i,double j)
{
	this.i=i;
	this.j=j;
	}
static void display(A ob) {
	System.out.println(ob.i);
	System.out.println(ob.j);
	
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A ob1= new A(10,10.2);
		A ob2= new A(100,10.21);
		display(ob1);
		display(ob2);
		
	}

}
