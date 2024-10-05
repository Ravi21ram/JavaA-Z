package com.typecasting.types;
class Super{
	public void supermethod() {
		System.out.println("this is the method of super class");
	}
}
class Sub extends  Super
{
	public void submethod() {
		System.out.println("this the method for sub class ");
	}
}
public class DerivedCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub1= new Sub();
		sub1.submethod();
		Super s1  = sub1;//  s1 is pointing to subclass object then s1 is called upcasting  referance variable( casting is for  high security purpose) 
		Sub sub2= (Sub) s1;
		sub2.submethod(); // sub2 is pointing to subclass object then sub2 is called downcasting referance variable ( casting is for  high security purpose) 
		sub2.supermethod();
	}

}
