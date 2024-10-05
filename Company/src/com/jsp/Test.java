package com.jsp;

import java.util.Scanner;

public class Test {


public static Scanner sc;

	public static void main(String[] args) 
	{

		 sc= new Scanner(System.in);
		System.out.println(" Enter the values = ");
		
		int rows=sc.nextInt();

		int i=1,j,k,l;
		while(i<=rows)
		{
			j=1;
			while(j<=rows-i)
			{
				System.out.print(" ");
				j++;
			}

			k=i;
			while(k>=1)
			{
				System.out.print(k);// k
				k--;
			}
			l=2;
			while(l<=i)
			{
				System.out.print(l);
				l++;
			}
			System.out.println();
			i++;
		}
		i=rows-1;
		while(i>0)
		{
			j=1;
			while(j<=rows-i)
			{
				System.out.print(" ");
				j++;
			}
			k=i;
			while(k>=1)
			{
				System.out.print(k);
				k--;
			}
			l=2;
			while (l<=i)
			{
				System.out.print(l);
				l++;
			}
			System.out.println();
			i--;

		}
	}
}


