package com.jsp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class BankOne implements Comparator <BankOne> {
	int bal;
	String name;
	public BankOne(int bal, String name) {
		super();
		this.bal = bal;
		this.name = name;
	}
	@Override
	public String toString() {
		return "nameis "+name+"   bal is "+bal;
	}
	@Override
	public int compare( BankOne b1,BankOne b2) {
		
		return b1.name.compareTo(b2.name);
//		return b1.bal-b2.bal;			
	}
}

public class ComparTable {

	public static void main(String[] args) {
		BankOne b1 = new BankOne(186378, "ravi");
		BankOne b2 = new BankOne(5667700, "abc");
		BankOne b3 = new BankOne(234, "Efgh");
		BankOne b4= new BankOne(1878, "efgh");
	ArrayList<BankOne> a1 = new ArrayList<BankOne>();
	a1.add(b1);
	a1.add(b2);
	a1.add(b3);
	a1.add(b4);
	System.out.println(a1);
	Collections.sort(a1,b1);
	System.out.println(a1);

	}

}
