package com.jsp.service;

//import com.jsp.account.*;
import com.jsp.account.GPay;
import com.jsp.bankuser.Atm;
import com.jsp.bankuser.BankUser;
import com.jsp.bankuser.PhonePay;

public class ServiceTransction {
	
	
	BankUser b2;
	public BankUser login( int pin)
	{
		if (pin ==1111)
		{
			b2= new Atm();// a1=new Atm()
			return b2;
		}
		else if( pin==2222)
		{
			b2= new PhonePay();
			return b2;
		}
		else if( pin==3333)
		{
			b2= new GPay();
			return b2;
		}else 
		{
			return b2;
		}
		
	}

}
