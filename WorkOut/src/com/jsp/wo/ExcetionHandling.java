package com.jsp.wo;

public class ExcetionHandling {

	public void excption( int a, int i)
	{
		int n =100;
		int[] arry= {1,2,3,4,5};
		try 
		{
			int div= n/a;
			System.out.println(div);
			System.out.println( arry[i]);
		}
		catch ( Exception e)
		{
			System.out.println("handeled");
		}		
	}
	public static void main(String[] args) {
		ExcetionHandling eh =  new ExcetionHandling();
		eh.excption(1,1);
		eh.excption(0,1);
		eh.excption(0,9);
	}
}
