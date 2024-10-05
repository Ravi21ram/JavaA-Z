package com.jsp.account;

public class Account {
	private String name;
	private long accno;
	private double bal;
	public Account(String name,long accno )
	{
		this.name=name;
		this.accno=accno;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public long getaccno()
	{
		return accno;
	}
	public void setaccno(long accno) {
		this.accno=accno;
	}
	public double getbal()
	{
		return bal;
	}
	public double setbal(double bal) {
		return this.bal=bal;
	}
	
	
	
	

}
