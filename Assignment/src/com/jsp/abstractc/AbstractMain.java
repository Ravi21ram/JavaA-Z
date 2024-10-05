package com.jsp.abstractc;
abstract class A{
	public abstract  void test();
	public static void test2() {
		System.out.println("abstract class of  static concrete method ");
	}
	public  void test3() {
		System.out.println("abstract class of  non static concrete method ");
	}
}
class B extends A
{
	@Override
	public void test() {
		System.out.println("overrided abstracted method   ");
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 =new B();
		b1.test();
		b1.test3();
		A.test2();

	}

}
