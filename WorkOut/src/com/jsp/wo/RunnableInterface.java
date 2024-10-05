package com.jsp.wo;

public class RunnableInterface implements Runnable {
	@Override
	public void run() {
		for ( int i=0;i<=6;i++) {
			System.out.println(i);
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		RunnableInterface r1= new RunnableInterface();
		Thread t1 = new Thread(r1);
		t1.start();

	}

}
