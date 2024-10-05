package com.jsp.test1;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,10,8,2};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
}
}