package com.interfacer.implement;
interface A
{
	int s= 21;
	public void a() ;
}
class G implements A
{
	public void a()
	{
		System.out.println("overriden the interface");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g1= new G();
		g1.a();

	}

}
