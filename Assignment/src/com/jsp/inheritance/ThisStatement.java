package com.jsp.inheritance;
class Local{
	public Local() {
		System.out.println("zero arg of local");
	}
	public Local(int a) {
		this();                                 //local chaining
		System.out.println("a of local");
	}
	public Local(int x,int y) {
		this(10);
		System.out.println("x,y of local");
	}
}
class Global extends Local{
	public Global() {
		this(2);
		System.out.println("zero arg of global");
	}
	public Global(int i) {
		super(5,6);                              //global chaining
		System.out.println("i of global");
	}
}

public class ThisStatement {
	

	public static void main(String[] args) {
		new Global();
		

	}

}
