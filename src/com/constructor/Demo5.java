package com.constructor;

class Demo5 {
	Demo5(){
	
		System.out.println("from demo5()");
}
	Demo5(int i){
		System.out.println("from demo5(int i)");
	}
	Demo5(int i, int j){
		System.out.println("from demo5(int i, int j)");
	}

	
public static void main(String[] args ) {
	Demo5.p=new Demo5();
	Demo5.p1=new Demo5(10);
	Demo5.p2=new Demo5(10,30);
	
}
}


