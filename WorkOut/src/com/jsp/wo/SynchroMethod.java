package com.jsp.wo;

class Run{
	synchronized public void age() {
		for ( int i= 1;i<=3;i++)
		{
			System.out.println(i);
		}
	}
	synchronized public void series() {
		for ( int i= 1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}

class Serial extends Thread
{
	Run r1 = new Run();
	@Override
	public void run()
	{
		r1.age();
	}
}


public class SynchroMethod extends Thread {
	

	Run r = new Run(); 
//	public SynchroMethod(Run r)
//	{
//		this.r=r;
//	}
	@Override
	public void run() {
		r.age();
	}
	
	public static void main(String[] args) {
		Run r1 = new Run();
		
		SynchroMethod s1= new SynchroMethod();
		s1.start();
		System.out.println("------******-----");
		Serial s2= new Serial();
		s2.start();

	}

}
