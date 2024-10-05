package com.jsp.test3;
class Jspiders{
	String jspiders_branch="Basavanagudi";
	public  void display_branch() {
		System.out.println("branch name  : "+jspiders_branch);
	}
}
class Student extends Jspiders {
	String student_name;
	String student_degree;
	String degree_stream;
	int degree_YOP;
	public Student(String student_name,String student_degree,String degree_stream,int degree_YOP) {
		this.student_name=student_name;
		this.student_degree=student_degree;
		this.degree_stream=degree_stream;
		this.degree_YOP=degree_YOP;
	}
	public void Studentdetails() {
		System.out.println("name : "+student_name);
		System.out.println("degree : "+student_degree);
		System.out.println("stream : "+degree_stream);
		System.out.println("Y O P : "+degree_YOP);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Student s1=new Student("ravi","BE","ECE",2022);
		s1.display_branch();
		s1.Studentdetails();
		System.out.println("-----------------------------------------");
		Student s2=new Student("yogesh","BE","EEE",2022);
		s2.display_branch();
		s2.Studentdetails();

	}

}
