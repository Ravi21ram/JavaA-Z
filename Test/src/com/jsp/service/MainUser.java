package com.jsp.service;

import com.jsp.account.*;

import com.jsp.bankuser.*;


public class MainUser {

	public static void main(String[] args) {
		Account a1= new Account("abc", 1234l);
		ServiceTransction t1 = new ServiceTransction();
		BankUser u1 = t1.login(1111);
		u1.transaction(1000.00, a1, 1);
		u1.transaction(200.00, a1, 2);
		u1.transaction(0, a1, 3);
		
		System.out.println("__________________");
		



	}

}
