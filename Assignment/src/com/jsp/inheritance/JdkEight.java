package com.jsp.inheritance;
interface U
{
	public  void method1();
	public default void method2() {
		System.out.println("non static - default keyword  ");
	}
	public static void method3() {
		System.out.println(" static - static keyword ");
	}
}
class Y implements U{
	 public void method1() {
		System.out.println(" overriden interface method");
	}
}

public class JdkEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y1 =new Y();
		y1.method1();
		y1.method2();
		U.method3();

	}

}
