package com.jsp.shopping;

public class Shopping {
	String productname;
	String productid;
	double productamount;
	String address;
	
	public Shopping(String productname, String productid, double productamount, String address) {
		super();
		this.productname = productname;
		this.productid = productid;
		this.productamount = productamount;
		this.address=address;
	}
	public void selectproduct(String productname,double productamount )
	{
		if(this.productname== productname &&  this.productamount == productamount )
		{
			System.out.println(productname+ "is selected and buy it now");
		}
		else
		{
			System.out.println(" the selected product and amt are not matching");
		}
	}
}
