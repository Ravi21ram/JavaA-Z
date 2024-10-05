package com.jsp.user;

import com.jsp.cards.CreditCard;
import com.jsp.cards.DebitCar;
import com.jsp.shopping.ModeOfPayment;
import com.jsp.shopping.Shopping;
import com.sjp.accounts.Account;

public class MainUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a2= new Account("abc", 1234l,"123iob12341" ,"btm layout"); 
		a2.deposit( 30000);
		a2.withdraw(200);
		a2.checkbal();
		
		DebitCar d2 = new DebitCar("abc","12/26", 123);
		d2.transaction(123, a2, 2, 400.0);
		CreditCard c2 = new CreditCard(" abc", "12/26", 123);
		c2.transaction(123, a2, 1, 500.0);
		c2.handelimit(25000.00);
		
		Shopping s1 =new Shopping("mobile", "m1", 4550.00, "12 maharaja avenue cbe");
		s1.selectproduct("mobile", 4550.00);
		
		ModeOfPayment p1= new ModeOfPayment();
		p1.payment(s1, c2, 4550.00,123,a2);
		System.out.println("-----------user 2-----------");
		Account  a3 = new Account("ravi", 23445l,"455iob12341" ,"btm layout" );
		a3.deposit(30000.00);
		a3.withdraw(323.00);
		a3.checkbal();
		
		Shopping s2 =new Shopping("laptop", "hp", 50550.00, "12 maharaja avenue cbe");
		s2.selectproduct("mobile", 4550.00);
		
		
		
		
	}
}
