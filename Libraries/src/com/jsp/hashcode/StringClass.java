package com.jsp.hashcode;

public class StringClass  {
	String s1= " hello";
	static String s2= "hello";
	//@Override
	public int hashcode() {
		System.out.println(" hashcode");
		return 10;
	}
	//@Override
 public boolean equals() {
		if (s1==s2)
		{
	return true;
		}
		return false;
 }
 public void st() {
	 System.out.println(" ravi");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClass s1 =new StringClass();
		System.out.println(s1.hashcode());
		System.out.println(s1.equals());
		System.out.println(s2.length());
		
	}

}
