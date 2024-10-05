package com.jsp.exception;

public class ArithemeticExceptions {
	public  static void  div( int num)
	{
		try {
			int div= 500/num;
			System.out.println(div);// this line will through exception
		}
		catch(Exception at) {
			System.out.println("handeled");
			at.printStackTrace();// to trace the ecxeption
		}
		catch(Throwable t1  )
		{
			System.out.println("handeled");
		}
		finally {
			System.out.println(" final method");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		ArithemeticExceptions.div( 10);
		ArithemeticExceptions.div( 0);
		

	}

}
