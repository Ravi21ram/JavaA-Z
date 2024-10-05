package com.test.culumintion;

public class TestOne {

	public static void pattern(int num)
	{
		int i;
		int j;
		int k;// space 
		for( i=1;i<=num;i++ )
		{
			for(j=i;j<num;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				if(k==1|| i==num || k==(2*i-1))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");


		}

	}


	public static void main(String[] args) {
		pattern(7);
	}
}
