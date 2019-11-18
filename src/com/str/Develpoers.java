package com.str;

class Develpoers  extends Emp {
	
		String language;
		Develpoers(){}
		Develpoers(int id,String name,double salary,String language){
			super(id,name,salary);
			this.language=language;
		}
		public String toString() {
			return super.toString()+ "  " +language;
		}
		public boolean equals(Object ob) 
		{ 
			Develpoers temp=(Develpoers)ob;
			return super.equals(temp) && this.language.equals(temp.language);
			
		}
		public int hashCode() {
			int hs=super.hashCode()+language.hashCode();
			return hs;

	}
}



