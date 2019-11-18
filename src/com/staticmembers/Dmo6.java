package com.staticmembers;

public class Dmo6 {
static int price;
static String colour;
static void writing()
{
System.out.print("marker of colour "+colour+"is writing");		
	
	}
public static void main(String[] args) {
	System.out.println(Dmo6.price);
	System.out.println(Dmo6.colour);
Dmo6.price=100;
Dmo6.colour="black";
Dmo6.price=10;
Dmo6.colour="blue";
System.out.println("marker price"+Dmo6.price+"marker colour"+Dmo6.colour);
Dmo6.writing();

}

}

