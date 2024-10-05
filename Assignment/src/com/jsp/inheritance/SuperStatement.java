package com.jsp.inheritance;
class A{
	public A(int a) {
		super();
		System.out.println("class A");
	}
}                                            //example for super(); 
class B extends A{
	public B(int b) {
		super(5);
		System.out.println("class B");
	}
}

public class SuperStatement {

	public static void main(String[] args) {
		new B(8);
	

	}

}
