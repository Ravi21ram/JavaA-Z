package com.jsp.test2;

public class Calc {
	public void calculate(int a,int b,String symbol) {
		switch(symbol) {
	case "+":
		System.out.println(a+b);
		break;
	case "-":
		System.out.println(a-b);
		break;
	case "*":
		System.out.println(a*b);
		break;
	case "/":
		System.out.println(a/b);
		break;
		default:
			System.out.println("invalid data");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c1=new Calc();
		c1.calculate(11,3, "-");
		

	}

}
