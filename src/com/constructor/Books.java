package com.constructor;

class Books {
	String name;
	int price;
	String isbn;
	static int x;
	Books()
	{ 
		++x;
		isbn="isbn"+x;
}
	Books(String name, int price){
		this();
		this.name=name;
		this.price=price;
	}
	void jounor(String type)
	{
	System.out.println(name + " is in " + type + " genere ");
	}
	
	
	

}
