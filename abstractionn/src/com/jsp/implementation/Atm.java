package com.jsp.implementation;

import com.jsp.account.Account;

public class Atm  extends Account implements User
{
	static double bal=0.0;
	double  amt;
	 
	@Override
	public void transfer( String choice, double  amt  ) {
		System.out.println("transfer of Atm");
		System.out.println(" type deposite  for deposite");
		System.out.println(" type withdraw for withdraw ");
		 if ( choice == "deposite" )
		 {
			 
			deposite(amt); 
		 }
		 else if (choice == "withdraw" )
		 {
			 withdraw(amt);
		 }
		 else
		 {
			 System.out.println(" the  number pressed worng");
		 }
	}
	public void deposite ( double amt )
	{
	 bal= bal + amt;
		System.out.println(" balance amount after deposite is" + amt);
	}
	public void withdraw ( double amt )
	{
		if ( bal > amt )
		{
			 bal = bal - amt;
			System.out.println(" the balance after withdraw is" + bal);
		}
		else
		{
			System.out.println(" insufficent balace ");
		}

	}

}
