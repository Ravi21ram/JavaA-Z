package com.jssp.test4;
class User{
	String username;
	int id;

	public User( String username, int id)
	{
		this.username=username;
		this.id=id;
	}
	public void userdetails() {
		System.out.println(username);
		System.out.println(id);
	}
	public void productDetails(int i) {
		// TODO Auto-generated method stub

	}
}
class Customer extends User{

	String customername;
	int customerid;

	public Customer(String customername ,int customerid ) {
		super( customername,  customerid);
		this.customerid=customerid;
		this.customername=customername;
	}
	public void orderProduct(String productName) {
		System.out.println(productName);
	}
}
class Employee extends User {
	String empname;
	int empid;
	public Employee (String empname,int empid) {
		super("ram",89);
		this.empname=empname;
		this.empid=empid;
	}
	public void productDetails( int productid ) {
		System.out.println(productid);
	}
}
class Service {
	public User userLongin(User u1) {
		if( u1 instanceof Customer ) {
			return u1;
		}
		else {
			return u1;	
		}
	}
}

public class MainUser {

	public static void main(String[] args) {
		Service s1= new Service();
		Customer c1= new Customer("rakshith",8);
		s1.userLongin(c1);
		User u1 = c1;
		Customer c2 = (Customer)u1;   
		c2.orderProduct("pen");
		c2.userdetails();
		System.out.println("------");

		Employee e1= new Employee("karthi", 889);
		s1.userLongin(e1);
		User u2= e1;
		Employee e2= (Employee)u2;
		e2.productDetails(45);
		e2.userdetails();
	
	}

}
