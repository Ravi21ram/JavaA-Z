package com.jsp;

public class Stringrevere {

	public static void main(String[] args) {
		String a= "Ravi";
		String rem="";
		System.out.println("hello");
		if( a.length()>=1 || a.length()<=100 )
		{
			for(int i=a.length()-1 ;i>=0;i--)
			{
				if( a.charAt(i)>=97 && a.charAt(i)<=122)
				{
					rem= rem+a.charAt(i);
				}
			}
			System.out.println(rem);
		}
	}

}
