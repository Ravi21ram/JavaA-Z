package com.jsp.exception;

public class TryWithMultipleCatch {
	public static void arthi( int a) throws ArithmeticException {
		try
		{
			int div= 500/a;
			System.out.println(div);
			int [] array= {1,2,3,4,5};
			System.out.println(array[a]);
		}
		catch (Exception e1 )
		{
			System.out.println(" it method is for exception");
		}
		finally
		{
			try
			{
				int num= 500/a;
				System.out.println(num);
				String [] array= {" r","a","v","i"};
				System.out.println(array[a]);
			}
			catch (ArrayIndexOutOfBoundsException  b1 )
			{
				System.out.println(" it method is for ArrayIndexOutOfBoundsException ");
			}
			
			
			
			System.out.println(" finally mwtod print for every object which was passing");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TryWithMultipleCatch.arthi(10);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------------");
		try {
			TryWithMultipleCatch.arthi(0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------------");
		try {
			TryWithMultipleCatch.arthi(3);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
