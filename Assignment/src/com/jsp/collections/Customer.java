package com.jsp.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Customer implements Comparable< Customer> {
	String name;
	String email;
	long phno;
	int cutomerid;

	public Customer(String name, String email, long phno,int cutomerid) {
		super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.cutomerid = cutomerid;
	}
	@Override
	public String toString () {
		 
		return "name is "+name+"email is" +email+"phno is"+phno+"cutomeris"+cutomerid ;
	}
	@Override
	public int compareTo( Customer c1)
	{
		return this.cutomerid - c1.cutomerid;
	}

	public static void main(String[] args) {
		Customer v1 =new Customer(" ravi","ravi123@",123456777l, 1);
		Customer v2 =new Customer(" yog","yog123@",56777l, 2);
		Customer v3 =new Customer(" ram","ti123@",56777l, 3);
		Customer v4 =new Customer(" san","yuui123@",56777l, 4);
		
		
		Vector <Customer> y1 =new Vector<Customer>();
	y1.add(v1);
	y1.add(v2);
	y1.add(v3);
	y1.add(v4);
	System.out.println(" before sorting "+y1);
	Collections.sort(y1);
	System.out.println("after sorting"+y1);
	Iterator <Customer> t1=y1.iterator();
	while(t1.hasNext())
	{
		System.out.println(t1.next());
	}
	
		
		
		

	}

}
