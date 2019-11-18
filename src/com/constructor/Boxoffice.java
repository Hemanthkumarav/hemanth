package com.constructor;

class Boxoffice {
	public static void main(String [] args) {
		Movie m1=new Movie("kq",5.0,2011);
		Movie m2=new Movie("uu",5.0,2011);
		Movie m3=new Movie("kqkk",5.0,2011);
		System.out.println("name" + m1.name +"  rating"+ m1.rating+ " yearOfRealse"+m1.yearOfRealse);
		System.out.println("name" + m2.name +"  rating"+ m2.rating+ " yearOfRealse"+m2.yearOfRealse);
		System.out.println("name" + m3.name +"  rating"+ m3.rating+ " yearOfRealse"+m3.yearOfRealse);
	}

}
