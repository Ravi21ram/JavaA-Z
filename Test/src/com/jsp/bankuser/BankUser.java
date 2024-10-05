package com.jsp.bankuser;


import com.jsp.account.*;
//import com.jsp.account.Transaction;

public interface BankUser {
	
	

	void transaction(double amt, Account a1, int choise);
}
