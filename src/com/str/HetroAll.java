package com.str;

import java.util.ArrayList;

class HetroAll {
	public static void main(String []args) {
		ArrayList hetro=new ArrayList();
		
		hetro.add(new Movie1("kgf",5));
		hetro.add(new Emp1(1,"hhh"));
		hetro.add(10);
		System.out.println(hetro);
		for(int i=0;i<hetro.size();i++) {
			Object x=hetro.get(i);
			if(x instanceof Movie1) {
				System.out.println(((Movie1)x).name);
				
				
			}
			if(x instanceof Integer) {
				System.out.println(((Integer)x)+10);
				
				
			}

			
		}
	}

}
