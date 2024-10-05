package com.assn.bms;

public class ReverseInteger {
	
	public static void rev(int num )
	{
		int temp=num;
		int reverse=0;
		while (temp!=0)
		{
			int remainder=temp%10;
			reverse= reverse*10+remainder;
			temp=temp/10;
			
		}
		System.out.println(" the reversed number is "+ reverse);
	}
	
	public static void main(String[] args) {
		rev(1234);
		
	}

}
