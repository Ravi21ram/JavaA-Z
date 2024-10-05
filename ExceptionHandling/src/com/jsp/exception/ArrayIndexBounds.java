package com.jsp.exception;

public class ArrayIndexBounds {
	 static int []a = {1,2,3,4};
	public static void array() {
		System.out.println(a[1]);
		try {
			System.out.println((a[7]));// this line will through exception
		} catch (Exception e) {
			System.out.println(" handeled");
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		ArrayIndexBounds.array();

	}

}
