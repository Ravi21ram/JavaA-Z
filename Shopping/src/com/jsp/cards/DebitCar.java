package com.jsp.cards;

import com.sjp.accounts.Account;

public class DebitCar {
	String card_name;
	String expdate;
	int cvv;
	public DebitCar(String card_name, String expdate, int cvv) {
		super();
		this.card_name = card_name;
		this.expdate = expdate;
		this.cvv = cvv;
	}
	public void transaction( int cvv, Account a1, int choice ,double amt)
	{
		if( this.cvv==cvv)
		{
			if( choice==1)
			{
				a1.deposit(amt);
			}
			else if (choice==2)
			{
				a1.withdraw(amt);
			}
			else if (choice==3)
			{
				a1.checkbal();
			}
			else
			{
				System.out.println("invalide user");
			}
		}
	}

}
