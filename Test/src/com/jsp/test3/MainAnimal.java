package com.jsp.test3;
class Animal{
	String name;
	public Animal(String name) {
		this.name=name;
	}
	
	
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void showname() {
		System.out.println("name of the dog is : "+name);
	}
	public void noise() {
		System.out.println("noise like bow bow");
	}
}

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog("tommy");
		d1.showname();
		d1.noise();
	}

}
