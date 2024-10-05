package com.jsp.inheritance;
class Amazon{
	public void order() {
		System.out.println("Amazon orders");
	}
}
class Fashion extends Amazon{
	public void men() {
		System.out.println("men's wears");
	}
	public void women() {
		System.out.println("women's wears");
	}
}
class FashionBrand extends Fashion{
	public void puma() {
		System.out.println("puma brand");
	}
	public void nike() {
		System.out.println("nike brand");
	}
}
class Electronics extends Amazon{
	public void mobile() {
		System.out.println("mobiles");
	}
	public void laptop() {
		System.out.println("laptops");
	}
}
class ElectronicsBrand extends Electronics{
	public void samsung() {
		System.out.println("samsung brand");
	}
	public void dell() {
		System.out.println("dell brand");
	}
}
class HomeAp extends Amazon{
	public void bed() {
		System.out.println("beds");
	}
}
class HomeApBrand extends HomeAp{
	public void curl_on() {
		System.out.println("curl-on brand");
	}
}
public class Main {

	public static void main(String[] args) {
		FashionBrand f1=new FashionBrand();
		f1.puma();
		f1.nike();
		f1.men();
		f1.women();
		f1.order();
		System.out.println("--------------------------------------------------");
		ElectronicsBrand e1=new ElectronicsBrand();
		e1.samsung();
		e1.dell();
		e1.mobile();
		e1.laptop();
		e1.order();
		System.out.println("---------------------------------------------------");
		HomeApBrand h1=new HomeApBrand();
		h1.curl_on();
		h1.bed();
		h1.order();
	}

}
