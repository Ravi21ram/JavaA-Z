package com.jsp.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeeSet implements Comparable<TreeeSet>
{
	String name;
	String email;
	long phno;
	int cutomerid;


	public TreeeSet(String name, String email, long phno, int cutomerid) {
		super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.cutomerid = cutomerid;
	}


	@Override
	public String toString() {
		return "TreeeSet [name=" + name + ", email=" + email + ", phno=" + phno + ", cutomerid=" + cutomerid + "]";
	}

	@Override
	public int compareTo(TreeeSet o) {
		// TODO Auto-generated method stub
		return this.cutomerid-o.cutomerid;
	}
	public static void main(String[] args) {
		TreeeSet  t1 = new TreeeSet (" ravi","ravi123@",123456777l, 1);
		TreeeSet  t2 = new TreeeSet (" hello","hello123@",123456777l, 3);
		TreeeSet  t3 = new TreeeSet (" world","world123@",123456777l, 5);
		TreeeSet  t4 = new TreeeSet (" zxy","zxyr123@",123456777l, 9);
		TreeSet <TreeeSet> u1= new TreeSet <TreeeSet>();
		u1.add(t1);
		u1.add(t2);
		u1.add(t3);
		u1.add(t4);
		//u1.add(t5);
	
		System.out.println(u1);
		Iterator <TreeeSet> i=u1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}


	




	
}
