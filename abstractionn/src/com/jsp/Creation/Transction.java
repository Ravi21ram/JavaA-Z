package com.jsp.Creation;

import com.jsp.implementation.Atm;
import com.jsp.implementation.User;
import com.jsp.implementation.Web;

public class Transction {
	User u1;
	public User objectctreation(int pin) {
		if ( pin ==1234 )
		{
			u1 = new Atm();
			System.out.println("object of atm is created");
			return u1;
		}
		else  
		{
			u1=new Web();
			System.out.println("object of web is created");
			return u1;	
		}	
	}
}
