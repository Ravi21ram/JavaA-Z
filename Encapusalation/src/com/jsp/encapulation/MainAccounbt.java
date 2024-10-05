package com.jsp.encapulation;

public class MainAccounbt {
	public static void main(String[] args) {
		Transtraction t1= new Transtraction();
		Account a1= new Account ();
		t1.deposit(1000, a1);
		t1.checkbal(a1);
		t1.withdraw(-200, a1);
		t1.checkbal(a1);
		
	}

}
