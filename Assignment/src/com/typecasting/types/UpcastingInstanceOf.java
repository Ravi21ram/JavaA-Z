package com.typecasting.types;
class A{
	public void aa() {
		System.out.println("method of class A");
	}
}
class B extends A{
	public void bb() {
		System.out.println("method of class B");
	}
}
class C extends A{
	public void cc() {
		System.out.println("method of class C");
	}
}
class D {
	public void method( A a22  ) {
		if( a22 instanceof B) {
			 B b2 = new B ();
			 b2.bb();
		}
		else if(a22 instanceof C){
			C c2= new C();
			c2.cc();
		}
		else {
			A a1=new A();
			a1.aa();
		}
	}
}
public class UpcastingInstanceOf {

	public static void main(String[] args) {
		D d1 =new D();
		A a2 = new A();
		d1.method(a2);
		
		System.out.println("--------------------");
		B b1=new B();
		d1.method(b1);
		
		C c1=new C();
		d1.method(c1);
		

	}

}
