 package com.jsp.wo;

interface Super
{
	public void m1();
	public static void m2 () {
		System.out.println("static concrete");
	}
	public default void m3() {
		System.out.println(" non - static concrete");
	}
}
class Sub implements Super
{
	@Override
	public void m1() {
		System.out.println("override here");
	}
}



public class Jdk8 {

	public static void main(String[] args) {
		Super.m2();   // this is for static method  
		Sub s1= new Sub ();
		s1.m3();
		s1.m1();


	}

}
