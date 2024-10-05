package com.jsp.threads;

public class ThreadByUsingImplementaionInterface implements Runnable {
	public void run()
	{
		for ( int i=1; i<=10;i++)
		{
			try {
				System.out.println(i);
			Thread.sleep(3000); // delay the process
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
			catch ( InterruptedException r1)
			{
				
			}
		
		}
	}
	public static void main(String[] args) {
		ThreadByUsingImplementaionInterface f1= new ThreadByUsingImplementaionInterface();
		Thread d1= new Thread ( f1); // up casting the f1 to its super class Thread 
		d1.start();
		
	}

}
