package com.jsp.test1;

public class Array {

	public static void main(String[] args) {
		int []a= {2,7,8,6,1};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
			
		}
		System.out.println(count);
		}
}
