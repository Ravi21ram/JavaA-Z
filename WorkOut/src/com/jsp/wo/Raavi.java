package com.jsp.wo;

import java.util.Iterator;
import java.util.TreeSet;

class Raavi implements Comparable<Raavi>
{
	double salary;
	public Raavi(double salary)
	{
		this.salary=salary;
	}
	public int compareTo(Raavi r)
	{
		return   ((int)this.salary-(int)r.salary);
	}
	public String toString()
	{
		return "the employee salary is"+salary;
	}
	
	public static void main(String[] args) {
		Raavi a1= new Raavi(1000);
		Raavi a2= new Raavi(290);
		Raavi a3= new Raavi(7770);
		Raavi a4= new Raavi(100);
		TreeSet<Raavi> r1= new TreeSet<Raavi>();
		r1.add(a1);
		r1.add(a3);
		r1.add(a2);
		r1.add(a4);
		r1.add(a1);
		r1.forEach( obj -> System.out.println(obj));
		
	}
}