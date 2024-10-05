package com.jsp.encapulation;

public class Main {
	private String mail="abc@124";
	private String password = "1234";
	
	public String  getmail()
	{
		return mail;
	}
	public void  setmail(String mail)
	{
		this.mail=mail;
	}
	public String getpassword()
	{
		return password;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}

	public static void main(String[] args) {
		Main m1= new Main();
		System.out.println(m1.getmail());
		m1.setmail("xzs@1223");
		System.out.println(m1.getmail());
		System.out.println(m1.getpassword());
		m1.setpassword("56778");
		System.out.println(m1.getpassword());

	}

}
