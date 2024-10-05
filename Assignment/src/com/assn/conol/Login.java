package com.assn.conol;

public final class Login {
	String email;
	long phno;
	String password;
	public Login(String email,String password) {
		this.email=email;
		this.password=password;
	}
	public Login(long phno,String password) {
		this.phno=phno;
		this.password=password;
	}
	public void showdet() {
		System.out.println("mail_id : "+email);
		System.out.println("phno : "+phno);
		System.out.println("password : "+password);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l1=new Login("xyz@gmail.com","x@123");
		l1.showdet();
		System.out.println("----------------------------------------------------");
		Login l2=new Login(9898989090l,"a@123");
		l2.showdet();
	}

}
