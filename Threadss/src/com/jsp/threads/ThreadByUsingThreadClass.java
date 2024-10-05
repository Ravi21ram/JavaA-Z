package com.jsp.threads;

public class ThreadByUsingThreadClass extends Thread
{
	@Override
	public void run()
	{
		for ( int i= 1;i<10;i++ )
		{
			System.out.println( i);
			
		}
		
	}
	public static void main(String[] args) {
		ThreadByUsingThreadClass t1= new ThreadByUsingThreadClass();
		t1.start();// in start methods its  executes run 
	}
	
	
	
	

}
