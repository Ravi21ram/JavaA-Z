package com.jsp.threads;
class Music 
{
	synchronized public void play() {
		for ( int i= 1; i<=3;i++)
		{
			System.out.println(" the play music" +i);
		}
	}
	synchronized public void stop()
	{
		for ( int i= 1; i<=3;i++)
		{
			System.out.println(" the stop music" +i);
		}
	}
}
class Thread1 extends Thread
{
	Music m1 ;
	public Thread1 (Music m1 )
	{
		this.m1=m1;
	}
	@Override
	public void run( )
	{
		
		m1.play();
	}
}
class Thread2 extends Thread
{ 
	Music m1 ;
	public Thread2( Music m1)
	{
		this.m1=m1;
	}
	@Override
	public void run()
	{
		
		m1.stop();
	}
}
public class ThreatSynchronization {
	public static void main(String[] args) {
		
	
	Music m1 =new Music();
	Thread1 t1 =  new Thread1(m1);
	Thread2 t2 =  new Thread2(m1);
	t1.start();
	t2.start();
	
	}
	
	
	
}
