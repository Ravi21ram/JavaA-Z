package com.jsp.maps;

import java.util.LinkedHashMap;
import java.util.Set;


class Students
{
	String name;

	public Students(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + "]";
	}
	
}
class Studentsmarks
{
	Double markses;

	public Studentsmarks(Double markses) {
		super();
		this.markses = markses;
	}

	@Override
	public String toString() {
		return "Studentsmarks [markses=" + markses + "]";
	}
	
}

public class LinkedHashMapHW {

	public static void main(String[] args) {
		Studentsmarks s1= new Studentsmarks(99.5);
		Studentsmarks s2= new Studentsmarks(88.5);
		Studentsmarks s3= new Studentsmarks(85.0);
		Students st1= new Students("a");
		Students st2= new Students("b");
		Students st3= new Students("c");
		
		LinkedHashMap <Students ,Studentsmarks > l1= new LinkedHashMap <Students, Studentsmarks>();
		l1.put(st3, s3);
		l1.put(st2, s2);
		l1.put(st1, s1);
		l1.put(st3, s3);
		
		Set <Students> k2=l1.keySet();	
		for(Students key:k2 )
		{
			System.out.println(l1.get(key));
		}

	}

}
