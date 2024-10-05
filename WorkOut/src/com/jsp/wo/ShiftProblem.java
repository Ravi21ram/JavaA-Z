package com.jsp.wo;

import java.util.Scanner;

public class ShiftProblem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number :");
		int number = scanner.nextInt();
		System.out.println("Enter the numbers of value to be shifed");
		int shift = scanner.nextInt();

		String numberStr = String.valueOf(number);
		int length = numberStr.length();
		shift = shift%length;

		String result = numberStr.substring(length - shift)+ numberStr.substring(0,length-shift);

		System.out.println("The result is "+ result);

	}

}
