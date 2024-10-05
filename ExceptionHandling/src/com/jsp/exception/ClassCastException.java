package com.jsp.exception;


class A{
	
}
class B extends A {
	
}
class C extends A {
	
}

public class ClassCastException {
	

	public static void main(String[] args) {
		B b1= new B();
		A a1= b1;
		try {
			C c= (C)a1;// class cast exception
		}
		catch ( Exception es1)
		{
			System.out.println(" handeled");
		}
		

	}

}
