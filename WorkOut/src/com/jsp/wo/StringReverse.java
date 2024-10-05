package com.jsp.wo;

public class StringReverse {

	public static void main(String[] args) {
		String name="ravi";
		String temp=" ";
		char charct;
		
		System.out.println( "befor  name is " +name );//ravi
		for(int i=0 ; i<name.length();i++ )
		{
			charct = name.charAt(i);
			temp=charct+temp; // r+"" , i=0
			// i++= i=1
			//  ar , i
		}
		System.out.println(" after name is reversed "+ temp);

	}

}
