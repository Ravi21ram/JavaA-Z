package com.jsp.test3;
class Local{
	public Local() {
		System.out.println("zero arg con");
	}
	public Local(int a) {
		this();
		System.out.println("int a of local");
	}
	public Local(int x,int y) {
		this(10);
		System.out.println("int a of local");
	}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Local(5,5);

	}

}
