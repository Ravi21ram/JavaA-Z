package com.jsp.wo;

class A
{
	public void hello()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
class B extends Thread
{
	A a1= new A();
	public B ( A a1)
	{
		this.a1=a1;
	}

	@Override
	public void run()
	{
		synchronized(a1)
		{
			a1.hello();
		}
	}
}
class C extends Thread
{
	A a1= new A();
	public C (A a1)
	{
		this.a1=a1;
	}

	@Override
	public void run()
	{
		synchronized(a1)
		{
			a1.hello();
		}
	}
}

public class SynBlock {

	public static void main(String[] args) {
		A a2 = new A();
		C c1= new C(a2);
		c1.start();
		System.out.println("-----------");
		B b1= new B(a2) ;
		b1.start();

	}

}
