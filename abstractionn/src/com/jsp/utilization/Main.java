package com.jsp.utilization;

import com.jsp.Creation.Transction;

import com.jsp.implementation.User;

public class Main {

	public static void main(String[] args) {
		Transction t1=new Transction();
		User u1=t1.objectctreation(1234);
		u1.transfer( "deposite" , 1090);
		u1.transfer("withdraw", 95);
		System.out.println("----------------");
		User u2=t1.objectctreation(9867);
		u2.transfer( "recive", 2000);
		u2.transfer("send", 8);
		

	}

}
