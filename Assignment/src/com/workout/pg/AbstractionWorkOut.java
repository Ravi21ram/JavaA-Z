package com.workout.pg;
interface Cal 
{
	public void calculate( int a, int b);
}
class Add implements Cal{
	@Override
	public void calculate(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		
	}
}
class Sub implements Cal{
	@Override
	public void calculate(int a, int b) {
		int sub = a-b;
		System.out.println(sub);
		
	}
}
class Service {
	Cal c1;
	public Cal service (String symbol)
	{
		if ( symbol =="+" )
		{
			 c1 = new Add();
		}
		else if ( symbol =="-")
		{
			 c1= new Sub();
		}
		return c1;
	}
}

public class AbstractionWorkOut {

	public static void main(String[] args) {
		Service s1= new Service();
		Cal c2 = s1.service("+");
		c2.calculate(10,28 );
		System.out.println(">><<>>>>>>>>>>>>>><<<<<<<<<<");
		Cal c3 = s1.service("-");
		c3.calculate(10,28 );
		
		
		
		
		
		
		

	}

}
