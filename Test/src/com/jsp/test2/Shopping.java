package com.jsp.test2;

public class Shopping {
	String product_name;
	String product_id;
	double product_price;
	public Shopping(String product_name,String product_id,double product_price) {
		this.product_name=product_name;
		this.product_id=product_id;
		this.product_price=product_price;
	}
	public void showdet() {
		System.out.println("product_name is : "+product_name);
		System.out.println("product_id is : "+product_id);
		System.out.println("product_price is : "+product_price);
	}
	
	public void order_product() 
	{
		if(product_price>5000.0) {
			System.out.println("///1000-rs off");
			
		}
		System.out.println("order placed");
	
		
	}
	

	public static void main(String[] args) {
		Shopping s1=new Shopping("watch","123A",3000.0);
		s1.showdet();
		s1.order_product();
		System.out.println("--------------------------------------------");
		Shopping s2=new Shopping("phone","12e3",6000.0);
		s2.showdet();
		s2.order_product();

	}

}
