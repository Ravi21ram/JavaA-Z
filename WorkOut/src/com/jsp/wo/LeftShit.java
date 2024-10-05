package com.jsp.wo;

import java.util.Scanner;

public class LeftShit {



	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("enter the numbers :");
		int number = scanner.nextInt();
		System.out.println();
		System.out.println("Enter the value to be shifted :");
		int shift = scanner.nextInt();

		String numberStr = String.valueOf(number);
		int length = numberStr.length();
		shift= shift%length;
		String result = numberStr.substring(shift)+ numberStr.substring(0,shift);

		System.out.println("Shifted number result is : - "+result);

	}

}
