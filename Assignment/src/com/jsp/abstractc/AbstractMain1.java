package com.jsp.abstractc;
abstract class D{
	public abstract  void test();
}
class C extends A
{
	@Override
	public void test() {
		System.out.println("overrided abstracted method   ");
	}
}

public class AbstractMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C b2=new C();
		b2.test();
		

	}

}
