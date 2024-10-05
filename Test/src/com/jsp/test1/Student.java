package com.jsp.test1;

public class Student {
	String name;
	String branch;
	static int semester=7;
	int marks;
	public Student(String name,String branch,int marks) {
			this.name=name;
			this.branch=branch;
			
			this.marks=marks;
	}
	public void checkdetails() {
		System.out.println(name);
		System.out.println(branch);
		System.out.println(marks);
		
	}
	public static void sem() {
		System.out.println(semester);
	}
	public void check() {
		if(branch=="EEE" || branch=="EC" || branch=="CS" || branch=="IS") {
			System.out.println("YES");
		}
	}
	public static void main(String[] args) {
		Student s1=new Student("ravi","EEE",80);
		s1.checkdetails();
		sem();
		s1.check();
		Student s2=new Student("yogesh","MECH",77);
		System.out.println("---------------------------------------------------------------");
		s2.checkdetails();
		sem();
		s2.check();
	}
}
