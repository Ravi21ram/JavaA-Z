package com.jsp.collection;

import java.util.*;

class bank implements Comparator <bank> {
	int bal;
	String name;
	public bank(int bal, String name) {
		super();
		this.bal = bal;
		this.name = name;
	}
	@Override
	public String toString() {
		return "nameis "+name+"bal is "+bal;
	}
	@Override
	public int compare(bank b1,bank b2) {
		
		return b1.name.compareTo(b2.name);
//		return b1.bal-b2.bal;			
	}
}
public class ComparatorTable {

	public static void main(String[] args) {
		bank b1 = new bank(186378, "ravi");
		bank b2 = new bank(5667700, "abc");
		bank b3 = new bank(234, "Efgh");
		bank b4= new bank(1878, "efgh");
		
		TreeSet<bank> t1 = new TreeSet<bank>(b1);
		
		t1.add(b4);
		t1.add(b1);
		t1.add(b2);
		t1.add(b3);
		t1.add(b4);
//		System.out.println(t1);
		Vector <bank>v1 = new Vector<bank>(t1);
//		System.out.println(v1);
	Collections.sort(v1,b1);
	System.out.println(v1);
		

	}

}
