package com.jsp.implementation;

import com.jsp.account.Account;

public class Web extends Account implements User   {
	//double bal;
	double bal= Atm.bal;

	@Override
	public void transfer( String choice,double  amt ) {
		System.out.println(" transfer of web ");
		System.out.println(" type send  for  sent the amount");
		System.out.println(" type recieve for balance amount after amount recived ");
		
		if ( choice== "send")
		{
			send(amt);
		}
		else if ( choice=="recive")
		{
			recive(amt);
		}

	}
	public void send( double samt)
	{
		if ( bal> samt)
		{
			bal = bal-samt;
			System.out.println(" balance amount after send is " + bal);
			
		}
		else 
		{
			System.out.println("insufficent balance");
		}
	}
	 public void recive( double amt)
	 {
		 System.out.println(  " original balance " +bal);
		 bal = bal+amt ;
		 System.out.println(  " balance after recived amount is  " +bal);
		 
	 }

}
