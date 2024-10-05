package com.jsp.test1;

public class LMVariable {
	static int a=1;
	public void add() {
		int b=20;
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		new LMVariable().add();
	}
}
