package com.jsp.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Librariess {
	String bookname;
	int bookid;
	String name;
	double duration;
	

	public Librariess(String bookname, int bookid, String name, double duration) {
		super();
		this.bookname = bookname;
		this.bookid = bookid;
		this.name = name;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Librariess [bookname=" + bookname + ", bookid=" + bookid + ", name=" + name + ", duration=" + duration
				+ "]";
	}

	public static void main(String[] args) {
		Librariess l1 = new Librariess("dsp", 0, "ravi", 2022);
		Librariess l2 = new Librariess("tqm", 11, "ram", 2021);
		Librariess l3 = new Librariess("sql", 333, "yog", 2000);
		Librariess l4 = new Librariess("java", 388, "jsp", 2023);
		HashSet a1 = new HashSet();
		
		a1.add(l1);
		a1.add(l2);
		a1.add(l3);
		a1.add(l4);
		System.out.println(a1);
		ArrayList k1 = new ArrayList(a1);
		System.out.println(k1.get(3));
		
		
		

	}

}
