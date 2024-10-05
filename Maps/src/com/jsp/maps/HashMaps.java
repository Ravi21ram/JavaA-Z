package com.jsp.maps;

import java.util.*;
import java.util.Set;

class Customer 
{
	int id ;
	String name;
	String product;
	public Customer(int id, String name, String product) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
	}
	@Override
	public String toString() {
		return "name is "+name+"id is "+id+"product is "+name;
		
	}
	
}

public class HashMaps {
	public static void main(String[] args) {
		
	
	Customer c1= new Customer(101, "cutomer1", "laptop");
	Customer c2= new Customer(102, "cutomer22", "pen");
	Customer c3= new Customer(103, "cutomer3", "mobile");
	Customer c4= new Customer(104, "cutomer4", "cap");
	
	LinkedHashMap <Customer , String> t1 = new LinkedHashMap <Customer , String>();
	t1.put(c4, "ravi");
	t1.put(c2, "ram");
	t1.put(c3, "siva");
	t1.put(c1, null);
	System.out.println(t1);
	System.out.println(t1.get(c4));
	System.out.println(t1.get(1));// null is output
	System.out.println(t1.containsKey(c1));
	System.out.println(t1.containsValue("ravi")); // it returns true
	Set<Customer> keys=t1.keySet();
	for(Customer Str:keys)
	{
		System.out.println(t1.get(Str));// retrive
		System.out.println(Str);// print
		
	}
	}
	

}
