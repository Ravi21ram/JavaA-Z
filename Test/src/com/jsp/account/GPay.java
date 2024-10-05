package com.jsp.account;

import com.jsp.bankuser.BankUser;


public class GPay implements BankUser {
Transaction t1 =new Transaction();
//Account a1= new Account();
	@Override

		public void transaction(double amt, Account a1, int choise) {
			if( choise==1) {
				t1.withdraw(amt, a1);
			}
			else if ( choise==2){
				t1.deposit(amt, a1);
				
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
