package com.constructor;

class Emp {

		String name;
		String singer;

		Emp(String name,String singer){
			this.name=name;
			this.singer=singer;
			
		}
		}
class B {
	
	public static void main(String[] args)	{
	Emp E1= new Emp("kkkkkk","jjjjj");
			System.out.println("name:"+ E1.name+ "singer:" + E1.singer ) ;
	}
	

}


