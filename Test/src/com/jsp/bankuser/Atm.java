package com.jsp.bankuser;

import com.jsp.account.Account;
import com.jsp.account.Transaction;

public class Atm implements BankUser {
	Account a1;
	Transaction t1= new Transaction();
	@Override
	
	public void transaction(double amt,Account a1 , int choise) {
		if( choise==1) {
			t1.deposit(amt, a1);
		}
		else if ( choise==2){
			t1.withdraw(amt, a1);
			
		}
		else if ( choise==3){
			t1.checkbal(a1); 
			
		}
		else 
		{
			System.out.println("invalid choice");
		}

	}

	


}
