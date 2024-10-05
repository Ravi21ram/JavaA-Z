package com.jsp.exception;

public class NullPointerException {
	public static void nullpint( String s2)
	{
		try
		{
			System.out.println(s2.equals("hello"));// this line will through exception
		}
		catch( Exception a1)
		{
			System.out.println("exceptin handeld");
		}
		
		System.out.println("method ended");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerException.nullpint("hello");
		NullPointerException.nullpint(null);
	}

}
