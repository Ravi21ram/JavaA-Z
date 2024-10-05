package com.jsp.account;

public class Transaction {
	public void deposit( double amt , Account a1)
	{
		double b1=a1.getbal()+amt;
		a1.setbal(b1);
		System.out.println("bal after deposit"+a1.setbal(b1));
	}
	public void withdraw( double amt , Account a1)
	{
		if( a1.getbal()>amt)
		{
			double b2 =a1.getbal()-amt;
		a1.setbal(b2);
		System.out.println(" bal after withdreaw" +a1.getbal());
		}
	}
	public void checkbal(Account a1)
	{
		System.out.println("current bal amt is "+a1.getbal());
	}

	

}
