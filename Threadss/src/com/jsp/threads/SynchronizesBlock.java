 package com.jsp.threads;
class Music3
{
	public void play() {
		for ( int i= 1; i<=3;i++)
		{
			System.out.println(" the play music" +i);
		}
	}
}

class Threads1 extends Thread
{
	Music3 m1 ;
	public Threads1 (Music3 m1)
	{
		this.m1=m1;
	}
	@Override
	public void run( )
	{
		synchronized(m1)
		{
			m1.play();
		}
		
	}
}
public class SynchronizesBlock {
public static void main(String[] args) {
	Music3 m2 = new Music3();
	Threads1 t1= new Threads1(m2);
	t1.start();
	
}
}
