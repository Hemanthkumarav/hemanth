package com.constructor;

class Bookstore {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b1=new Books("kkkkkkk",10);
		Books b2=new Books("jjjjjjjj",11);
		Books b3=new Books("lllllll",12);
		Books b4=new Books("mmmmmmm",13);
		Books b5=new Books("000000000",14);
		Books [] book= {b1,b2,b3,b4,b5};
		for(int i=0;i<book.length;i++)
		{
			System.out.println("name of the book" + book[i].name + " cost of the book "+   book[i].price + " isbn number is " +  book[i].isbn);
			book[i].jounor("THRILLER");
			
			
			
			
		}
			

	}

}
