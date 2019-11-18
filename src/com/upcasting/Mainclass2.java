package com.upcasting;


class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 ob1=new A2(10);
		B2 ob2=new B2(10,20);
		C2 ob3=new C2(30,40);
		display(ob1);
		display(ob2);
		display(ob3);
		

	}
	static void display(A2 obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B2) {
			B2 obj1=(B2)obj;
			System.out.println(obj1.j);
		}
		
		if(obj instanceof C2) {
				//C2 obj2=(C2)obj;
				//System.out.println(obj2.k);
		
			System.out.println(((C2)obj).k);
		}
				System.out.println("saisaiasaiasaiasaias");
		
	}
	}
	



