package com.jsp.encapulation;

public class Transtraction {
	public void deposit( double amt , Account a )
{
		if ( amt > 0)
		{
			double b1=a.getbal()+amt;
			a.setbal(b1);	
		}
		
}
public void withdraw(double amt , Account a)
{
	
	if ( a.getbal()>= amt&&amt>0)
	{
		double b2 = a.getbal()-amt;
		a.setbal(b2);
	}
	else
	{
		System.out.println("invalide withdraw");
	}
	
}
public void checkbal(Account a) {
	 System.out.println(a.getbal());
	
}

}
