package com.jsp.exception;

class ArithmeticException extends Exception
{
	public ArithmeticException(String msg) {
		super();
		System.out.println(" ar");
	}
}

public class UncheckedException {
	
	public static  void Num( int a, int b) throws ArithmeticException  
	{
		if ( a>=0 && b>=0)
		{
			int res = a+b;
			System.out.println(res);
		}
		else
		{
			throw new ArithmeticException(" enter proper num");
		}
		
	}


	public static void main(String[] args) throws ArithmeticException {
		try
		{UncheckedException.Num(9, -1);
			
		}
		catch (ArithmeticException f1)
		{
			System.out.println("handelled");
			f1.printStackTrace();
		}
		
		

	}

}
