package com.workout.pg;
class C
{
	int num;
	public void method(int num) {
		this.num=num;
//		System.out.println(num);
	}
	public void print()
	{
		System.out.println(num);
	}
}
public class ThisInMethod {
	public static void main(String[] args) {
		C c1=new C();
		c1.method(6);
		c1.print();
	}
}
