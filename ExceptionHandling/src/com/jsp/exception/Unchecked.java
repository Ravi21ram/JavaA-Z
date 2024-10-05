package com.jsp.exception;



class Name extends RuntimeException
{
	public Name ( String num)
	{
		super(num);
	}
}
public class Unchecked {
	
	public static void unchecked()
	{
		try
		{
			throw new Name("hello");
			
		}
		catch (Name w1 )
		{
			System.out.println(" handelled");
		}
		finally 
		{
			System.out.println("hello");
		}
	
	}
	public static void main(String[] args) {
		Unchecked.unchecked();
	}

}
