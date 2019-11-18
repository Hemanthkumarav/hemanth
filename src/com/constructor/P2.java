package com.constructor;



	public class P2{
		int i=10;
		double d=12.0; 
		P2(){
			System.out.println("from p2");
			System.out.println(i);
			System.out.println(d);
			System.out.println(this.i);
			System.out.println(this.d);
		}
		public static void main(String [] args)
		{
			P2 ob=new P2();
			System.out.println(ob.i);
			System.out.println(ob.d);
		}
		
	
			
		
		}






}
