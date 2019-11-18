package com.missalleuos;

class Employee {
	int id;
	String name;
	int salary;
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	
	}
	static Employee createEmployee(int id,String name,int salary)
	{ 
		Employee emp= new Employee(id,name,salary);
		return  emp;
	
	}
	Employee Intialize(int salary)
	{
	
		this.salary=salary;
		return this;
		
	}
	Employee display()
	{
		System.out.println(this.id);
		System.out.println(this.salary);
		System.out.println(this.name);
		return this;
						
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=Employee.createEmployee(1,"iiiiii",16).display();
		Employee emp2=Employee.createEmployee(2,"kiiiii",17).display();
		emp2.Intialize(21).display();
		
		
		

	}

}
