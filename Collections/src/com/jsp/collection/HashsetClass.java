package com.jsp.collection;

import java.util.HashSet;
import java.util.Vector;

public class HashsetClass {

	public static void main(String[] args) {
		HashSet <Integer>h1 =new HashSet<Integer>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		h1.add(1);
		h1.add(0);
		h1.add(null);
		Vector<Integer> v1= new Vector<Integer>(h1);
		System.out.println(v1);
//		System.out.println("before forEach method : "+h1);
//		System.out.println(" after using forEach method");
//		h1.forEach( Obl-> System.out.println(Obl));
		
		

	}

}
