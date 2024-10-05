package com.jsp;

public class Primenumber {

	public static void main(String[] args) {
		int num=13;
		int count=0;
		if( num==2||num==1)
		{
			System.out.println(" prime h number");

		}
		else {

			for( int i=2;i<=num-1;i++)
			{
				if(num%i!=0)
				{
					count++;
				}

			}
			if (count>=1)
			{
				System.out.println(" not prime number");
			}
			else
			{
				System.out.println(" a prime number");

			}
		}

	}

}
