package com.nonprimitivearray;

class Loan {
	String name;
	double roi;
	Loan()
	{
		
	}
	Loan(String name,double roi)
	{
		this.roi=roi;
		this.name=name;
	}
	void interset()
	{ 
		System.out.println(name + "is granted at" + roi + "%") ;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1=new Loan("vechile loan",12.0);
		Loan l2=new Loan("personal loan",18.0);
		Loan l3=new Loan("home loan",14.2);
		Loan [] loan= {l1,l2,l3, new Loan("makeup loan",100)
		};
		for(int i=0;i<loan.length;i++)
		{
			System.out.println(loan[i].name + "" + loan[i].roi); 
			loan[i].interset();
		}
		}

	}


