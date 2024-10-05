package com.assn.bms;
class Account{
	String name;
	long accno;
	double bal;
	public Account(String name,long accno,double bal) {
		this.name=name;
		this.accno=accno;
		this.bal=bal;

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
class Saving extends Account{

	public Saving(String name,long accno,double bal  ) {
		super(name,accno,bal);

	}
	public void withdraw (double amt) {
		if (amt>100) {
			bal=bal-amt;
			System.out.println(bal);
		}
	}
	public void roi() {
		bal=bal+bal*0.05;
		System.out.println(bal);
	}
}
class Current extends Account{
	double minbal=5000;
	public Current(String name,long accno,double bal  ) {
		super(name,accno,bal);
		bal=minbal;

	}
	public void withdraw(double amt) {
		if(bal-amt>minbal) {
			bal=bal-amt;
			System.out.println(bal);
		}
		else {
			System.out.println("maintain min bal");
		}
	}
	public void showbal() {
		System.out.println(bal);
	}
}

public class AccountMain {

	public static void main(String[] args) {
		System.out.println("user 1 in saving");
		Saving s1= new Saving("siva",12345678l,1500);
		s1.showdetails("siva",12345678l,1500);
		s1.withdraw(1000);
		s1.roi();
		System.out.println("user 2 in saving");
		Saving s2= new Saving("ram",995277l,3500);
		s2.showdetails("ram",9952771l,3500);
		s2.withdraw(1680);
		s2.roi();
		System.out.println("user 1 in current");
		Current c1 = new Current("ravi",93847431l,8000);
		c1.showdetails("ravi",93847431l,5000);
		c1.withdraw(4500);
		c1.showbal();
		System.out.println("user 2 in current");
		Current c2 = new Current("lakshmi",678908l,12347);
		c2.showdetails("lakshmi",678908l,12347);
		c2.withdraw(4900);
		c2.showbal();
	
		
		

	}

}
