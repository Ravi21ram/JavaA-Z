package com.test.one;

public class FirstClass {

	int id;
	String name;
	public FirstClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void methodNonVoid() {
		System.out.println("Non static method");
	}

	public static void main(String[] args) {

		FirstClass firstClass = new FirstClass(21, "Ravi");
		firstClass.methodNonVoid();
	}
}

class Second{

}