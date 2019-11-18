package com.str;

class Movie1 {
	
		String name;
		double rating;
		Movie1(){}
		Movie1(String name,int rating){
			this.name=name;
			this.rating=rating;
		}
		@Override
		public String toString() {
			return "Movie1 [name=" + name + ", rating=" + rating + "]";
		}
		

	}


