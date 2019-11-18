package com.str;

class Tester extends Emp {
	String tool;
	Tester(){}
	Tester(int id,String name,double salary,String tool){
		super(id,name,salary);
		this.tool=tool;
	}
	public String toString() {
		return super.toString()+ "  " +tool;
	}
	public boolean equals(Object ob) 
	{ 
		Tester temp=(Tester)ob;
		return super.equals(temp) && this.tool.equals(temp.tool);
		
	}
	public int hashCode() {
		int hs=super.hashCode()+tool.hashCode();
		return hs;
	}

}
