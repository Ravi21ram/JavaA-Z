package com.typecasting.types;
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

class Service{
	public void service(Account a) {
		if ( a instanceof Current )
		{
			Current c1= new Current("ravi", 12223, 9088);
			c1.withdraw(120);
		}
		else
		{
			Saving ss = new Saving("yog", 1990, 90);
			ss.withdraw(120.0);

		}
	}
}

public class MainPongaLAbsent {

	public static void main(String[] args) {
		Service Se= new Service();
		Current c2= new Current("ravi", 12345, 899);
		Se.service(c2);// to access the service
		System.out.println("---");
		Saving s1 =new Saving("yog", 1990, 90);
		Se.service(s1);
		//Account a = new Account();
	}

}
