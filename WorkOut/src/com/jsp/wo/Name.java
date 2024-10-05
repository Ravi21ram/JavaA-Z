package com.jsp.wo;

public class Name {
	
	String name;
	public Name(String name)
	{
		this.name=name;
	}
	public boolean equals(Object obj)
	
	{
		Name n1= ( Name)obj;
	
		return (this.name==n1.name )==true;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1= new Name("lakshmi");
		Name n2= new Name("lakshmi");
		System.out.println(n1.equals(n2));
		

	}

}
