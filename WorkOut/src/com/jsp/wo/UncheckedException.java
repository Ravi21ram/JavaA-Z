package com.jsp.wo;



class ArrayIOBE extends RuntimeException

{
	public static void array() {
		System.out.println(" array is out of bounds");
	}
}
public class UncheckedException  {

	public void uncheck () 
	{
		try 
		{
			throw new ArrayIOBE();
		}
		catch (ArrayIOBE e )
		{
			System.out.println("handled here");
			e.array();

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncheckedException uce = new UncheckedException();
		uce.uncheck();
	}

}
