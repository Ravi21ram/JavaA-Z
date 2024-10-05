package com.jsp.wo;

import java.util.Scanner;

public class IntegreReverse {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the Numbers for reverse: ");
		int number = scan.nextInt();
		int numberreversed =0;
		while (number !=0)
		{
			int numberslast = number%10;
			numberreversed= numberreversed*10 + numberslast;
			number= number/10;
		}
		System.out.println(" The reversed numbers are : "+ numberreversed);
	}

}
