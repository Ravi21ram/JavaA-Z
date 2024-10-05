package com.typecasting.types;

public class TypeCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" widening");
		int r=21;
		double d=r;
		System.out.println(r);
		System.out.println(d);
		System.out.println("narrowing");
		double f=222.44;
		int g=(int)f; // (int)values/variables is the keyword
		System.out.println(f);
		System.out.println(g);	
	}
}
