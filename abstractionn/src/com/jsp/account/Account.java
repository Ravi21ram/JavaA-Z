package com.jsp.account;



public class Account {
	  String name;
	
	 long accno;
	  double bal;
	
	public Account()
	{
		
	}
	
	
	public void withdraw(double amt) {
		if(bal>amt) {
			bal=bal-amt;
			System.out.println(bal);
		}
		else{
			System.out.println("no enough bal");
		}
	}
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println(bal);
	}
	public void showdetails(String name,long accno,double bal) {
		System.out.println(name);
		System.out.println(accno);
		System.out.println(bal);
	}
}
