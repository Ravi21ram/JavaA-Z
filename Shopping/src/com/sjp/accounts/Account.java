package com.sjp.accounts;

public class Account {
	// class work
	String name;
	long accno;
	double bal;
	String ifsc;
	String branch_name;
	static String bank_name="IOB";
	public Account( String name,long accno,String ifsc,String branch_name)
	{
		this.name=name;
		this.accno=accno;
		this.ifsc=ifsc;
		this.branch_name=branch_name;
	}
	public void withdraw(double amt) {
		if(bal>amt) {
			bal=bal-amt;
			System.out.println (" the withdraw balance is "+bal);
		}
		else{
			System.out.println("no enough bal");
		}
	}
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println( " the deposit balance is"+bal);
	}
	public void checkbal() {
		System.out.println( " balance is"+bal);
	}
	
	
}


