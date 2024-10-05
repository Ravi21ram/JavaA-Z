package com.jsp.wo;

class InSufficientCash extends Exception {

	public  static void noamount()
	{
		System.out.println(" aomount is in valide");
	}
}

public class CustomizedException {

	public  void exc( double needtowithdraw ) throws InSufficientCash
	{
		double amt =10000;
		if ( amt>needtowithdraw)
		{
			double wth= amt-needtowithdraw;
		}
		else
		{
			throw new InSufficientCash();
		}
	}
public static void main(String[] args) {
		CustomizedException ce = new CustomizedException ();
		try
		{
			ce.exc(25000);
		}
		catch (InSufficientCash i)
		{
			System.out.println("handled");
			i.noamount();
		}


	}

}
