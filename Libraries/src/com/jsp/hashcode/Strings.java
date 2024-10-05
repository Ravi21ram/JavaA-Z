package com.jsp.hashcode;

public class Strings {

	public static void main(String[] args) {
		String s1= " RavishAnkaranarayanan";
		String s2= " ravi";
		String s3= " Ravi";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.indexOf('A',4));// 7
		System.out.println();
		System.out.println(s1.substring(0,s1.length()-2));
		
		

	}

}
