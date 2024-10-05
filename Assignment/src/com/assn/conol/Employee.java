package com.assn.conol;

public class Employee {
	String name;
	String role;
	String email;
	long phno;
	int exp;
	public Employee(String name,String role,String email,long phno,int exp) {
		this.name=name;
		this.role=role;
		this.email=email;
		this.phno=phno;
		this.exp=exp;
	}
	public Employee(String name,String role,String email,long phno) {
		this.name=name;
		this.role=role;
		this.email=email;
		this.phno=phno;
	}
	public void showdet() {
		System.out.println("name : "+name);
		System.out.println("role : "+role);
		System.out.println("mail_id : "+email);
		System.out.println("phno : "+phno);
		System.out.println("exp : "+exp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("ravi","manager","ravi@gmail.com",9090989890l,2);
		e1.showdet();
		System.out.println("-------------------------------------------------");
		Employee e2=new Employee("yogesh","analyst","yogesh@gmail.com",89769909098l);
		e2.showdet();
	}

}
