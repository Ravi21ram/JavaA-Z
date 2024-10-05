package com.jsp.shopping;

import com.jsp.cards.CreditCard;
import com.jsp.cards.DebitCar;
import com.sjp.accounts.Account;

public class ModeOfPayment {
	public void payment( Shopping s1, DebitCar dc1, double amt , int cvv, Account a1 )
	{
		if( s1.productamount==amt)
		{
			dc1.transaction(123, a1, 2, amt);
			System.out.println("product placed "+s1.address);
		}
		else
		{
			System.out.println("entered amount is worng");
		}
	}
	public void payment( Shopping s1, CreditCard cc1, double amt , int cvv, Account a1 )
	{
		if( s1.productamount==amt && amt<cc1.creditbal)
		{
			cc1.transaction(123, a1, 2, amt);
			System.out.println("product placed "+s1.address);
		}
		else
		{
			System.err.println("entered amount is worng");// err
		}
	}
	 

}
