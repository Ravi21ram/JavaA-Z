package com.jsp.inheritance;
class Account {
	String name;
	long accno;
	double bal;
	public Account(String name,long accno) {
		this.name=name;
		this.accno=accno;
		
	}
	public void showdetails() {
		System.out.println("user name : "+name);
		System.out.println("acc no : "+accno);
	}
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println(bal);
	}
	public void withdraw(double amt) {
		if(bal>amt) {
			bal=bal-amt;
			System.out.println(bal);
	}
		else {
			System.out.println("insufficient balance");
		}
	}
}
class Savings extends Account{
	public Savings(String name,long accno){
		super(name,accno);
	}
	double roi=0.05;
	public void calculateroi() {
		bal=bal+bal*roi;
		System.out.println("rate of interest is"+roi);
	}
}
class Current extends Account{
	double minbal=5000.0;
	public Current(String name,long accno){
		super(name,accno);
	}
	public void showminbal() {
		System.out.println("min bal is : "+minbal);
	}
}

public class MainHeirarchical{

	public static void main(String[] args){
		
		Savings s1=new Savings("ravi",1234543218l);
		s1.showdetails();
		s1.deposit(5000.0);
		s1.withdraw(1000.0);
		s1.calculateroi();
		System.out.println("----------------------------------------------------");
		Current c1=new Current("yogesh",6457353637l);
		c1.showdetails();
		c1.deposit(8000.0);
		c1.withdraw(2000.0);
		c1.showminbal();
	}
}
