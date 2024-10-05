package com.typecasting.types;
class Test {

	public void test1(int b) 
	{
		System.out.println(b);
	}
	public void test2(double r) 
	{
		System.out.println(r);
	}
	public void test3(double r, int e) 
	{
		System.out.println( r + e);
	}

}
public class Primitive {

	public static void main(String[] args) {
		Test t1= new Test();
		t1.test1( 'R');// unicode value of r is 82
		t1.test1(10); //int value
		t1.test2(2.89);//double vlue
		t1.test3(234.67, 45);

	}

}
