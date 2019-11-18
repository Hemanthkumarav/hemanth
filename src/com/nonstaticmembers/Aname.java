package com.nonstaticmembers;

class Aname {
int i;
void intalizing(int i)
{
	this.i=i;
	System.out.println(i);
	
}
public static void main(String [] args) { 
	Aname x=new Aname();
	x.intalizing(10);
}

}
