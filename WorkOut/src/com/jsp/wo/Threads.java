package com.jsp.wo;
class T
{
	synchronized public void a() {
		for ( int i =0; i<=4;i++)
		{
			System.out.println(i);
		}
		
	}
}

class Threads1 implements Runnable
{
	T t2;
	public Threads1 (T t)
	{
		this.t2=t;
	}
	@Override
	public void run() {
		
		t2.a();
	}
}
public class Threads implements Runnable
	{
		T t2;
		public Threads (T t2)
		{
			this.t2=t2;
		}
		@Override
		public void run() {
			
			t2.a();
		}
	
	
	

	public static void main(String[] args) {
		T t1= new T();
		Thread t2= new Thread();
		Threads t =new Threads(t1);
		
		t2.start();
		Threads1 t3 = new Threads1(t1);
//		t3.start();
	}
	}	

