package com.jsp.abstraction;
interface User
{
	public void transfer();
}
class Atm implements User
{
	public void transfer() {
		System.out.println("amount is withdraw in atm ");
	}
}
class Web implements User{
	public void transfer() {
		System.out.println("amount is withdraw in web ");
	}
}
class Transaction {
	public User transaction ( User u1)
	{
		if ( u1 instanceof Atm )
		{
			User u2 = new Atm();
			return u2;

		}
		else 
		{
			User u3=new Web();
			return u3;
		}
	}
}
public class MainTranstraction {

	public static void main(String[] args) {
		Transaction t1= new Transaction ();
		Atm a1= new Atm();
		User u2=t1.transaction(a1);
		u2.transfer();
		System.out.println("------------------");
		Web w1=new Web();
		User u3=t1.transaction(w1);
		u3.transfer();

	}

}
