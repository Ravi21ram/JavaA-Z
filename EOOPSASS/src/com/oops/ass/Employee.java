package com.oops.ass;

public class Employee {
	String name;
	String role;
	String email;
	long phno;
	String exprience;
	public Employee( String name,String role, String email,long phno,String exprience)
	{
		this.name=name;
		this.role=role;
		this.email=email;
		this.phno=phno;
		this.exprience=exprience;
	}
	public Employee( String name,String role, String email,long phno)
	{
		this.name=name;
		this.role=role;
		this.email=email;
		this.phno=phno;
	}
	public void exprience()
	{
		System.out.println(name );
		System.out.println(role);
		System.out.println(email);
		System.out.println(phno);
		System.out.println(exprience);
	}
	
		

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1= new Employee( "abc","senior developer","abc@123",1234567891l," 5 years" );
		e1.exprience();
		System.out.println("----------------");
		Employee e2= new Employee( "xyz","fresher","xyz@123",9988776655l);
		e2.exprience();

	}

}
