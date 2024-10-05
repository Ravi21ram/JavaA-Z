package com.jsp.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employe  implements Comparable< Employe> {
	String name;
	int age;
	double sal;
	public Employe(String name, int age, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "name is "+  name+ " age is   "+ age+"sal is "+sal;

	}
	
	@Override
	public int compareTo(Employe u1) {
		
		return this.age-u1.age; // assending order
//		 return u1.age-this.age dessending order
	}

}


public class CollectionsSort  {
	public static void listmetod() {


		Employe e1 = new Employe("ravi",22 , 200.00);
		Employe e2 = new Employe(" yog", 21, 289.00);
		Employe e3 = new Employe("siva", 26, 500.00);
		Employe e4 = new Employe("ram", 24, 440.00);
		System.out.println(e1);
		ArrayList <Employe>l1 = new ArrayList<Employe>();
		l1.add(e1);
		//l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		System.out.println("before sort"+l1);
		Collections.sort(l1);
		System.out.println("after sort"+l1);

		


	}

	public static void main(String[] args) {

		CollectionsSort.listmetod();
	}

}


