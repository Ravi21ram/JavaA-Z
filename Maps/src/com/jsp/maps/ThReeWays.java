package com.jsp.maps;

class A 
{
	public void amethiod(A a)
	{
		System.out.println("super super method");
	}
}
class B extends A
{
	public void bmethod()
	{
		System.out.println("super method");
	}
}
class C extends A
{
	public void cmathod()
	{
		System.out.println("sub method");
	}
}

public class ThReeWays {
	public static void a3(A a3) {

		System.out.println(" method");
	
	}
	public static void cref( C cref) {

		System.out.println(" sub classs");
	
	}
	public static void main(String[] args) {
		B b1= new B();
		System.out.println("b method");
		a3(b1);
		System.out.println("a method");
		C c1 = new C();
		a3(c1);
		System.out.println("c method");
		A a1= new A();
		a3(a1);
		



	}

}
