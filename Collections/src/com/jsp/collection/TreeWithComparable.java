package com.jsp.collection;

import java.util.TreeSet;

class Student implements Comparable <Student>
{
	String name;
	int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Student st1) {
		return this.id-st1.id;
		
	}
	
}

public class TreeWithComparable {

	public static void main(String[] args) {
		Student s1= new Student("name1", 105);
		Student s2= new Student("name2", 102);
		TreeSet<Student>  t1= new  TreeSet<Student> ();
		t1.add(s2);
		t1.add(s1);
		System.out.println(t1);
		for(Student s: t1)
		{
			System.out.println(s);
		}
		

	}

}
