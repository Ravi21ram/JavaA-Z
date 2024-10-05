package com.jsp.exception;

public class StringIndexBounds {
	static String name="ravi";
	public static void string() {
		System.out.println(name.charAt(2));
		try {
			System.out.println(name.charAt(6));// this line will through exception
		}
		catch  ( Exception e1 )
		{
			System.out.println("handeled");
		}
		finally{
			System.out.println("finally metod");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringIndexBounds.string();
	}

}
