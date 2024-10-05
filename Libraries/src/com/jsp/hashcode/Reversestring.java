package com.jsp.hashcode;

import java.util.Scanner;

public class Reversestring {
	
	
	public static void reverseString( String name)
	{
		for ( int i = name.length()-1; i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your name");
				String name= sc.next();	
				
				reverseString(name);
				sc.close();

	}

}
