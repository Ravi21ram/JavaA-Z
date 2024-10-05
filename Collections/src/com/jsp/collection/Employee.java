package com.jsp.collection;

import java.util.Collections;
import java.util.TreeSet;

public class Employee implements Comparable <Employee> {
	String name;
	String email;
	long phno;
	int cutomerid;
	

	public Employee(String name, String email, long phno, int cutomerid) {
		super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.cutomerid = cutomerid;
	}
	


	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", phno=" + phno + ", cutomerid=" + cutomerid + "]";
	}
//	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.cutomerid-o.cutomerid;
	}



	public static void main(String[] args) {
		Employee e1= new Employee(" ravi","ravi123@",123456777l, 1);
		Employee e2= new Employee(" ravi","ravi123@",123456777l, 2);
		Employee e3= new Employee(" ravi","ravi123@",123456777l, 4);
		TreeSet<Employee> t1 = new TreeSet<Employee>();
		t1.add(e3);
		t1.add(e2);
		t1.add(e1);
		System.out.println(t1);
		
		System.out.println(t1);
		
		

	}



	

}
