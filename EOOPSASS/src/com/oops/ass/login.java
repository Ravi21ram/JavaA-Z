package com.oops.ass;

public class login 
{
	String email;
	int password;
	long phno;
	public login( String email,int password, long phno ) 
	{
		
		this.email=email;
		this.password=password;
		this.phno=phno;
		
	}
	public login( String email,int password ) 
	{
	
		this.email=email;
		this.password=password;
	}
	public void loginWithFour()
	{
		System.out.println(email);
		System.out.println(password);
		System.out.println(phno);
		
	}
	public void loginWithThree()
	{

		System.out.println(email);
		System.out.println(password);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login l1= new login( "xyz@123", 12345, 9988777654l ); 
		l1.loginWithFour();
		System.out.println("----------------");
		login l2= new login("abc@123", 678910); 
		l2.loginWithThree();
		
		

	}

}
