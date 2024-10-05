package com.jsp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class LengthOrder implements Comparator <String>
{
	@Override
	public int compare(String st1, String st2) {
		// TODO Auto-generated method stub
		return st1.length()-st2.length();
	}

}
class Dec implements Comparator<String>
{
	@Override
	public int compare( String s1, String s2)
	{
		return s1.compareTo(s2);
	}
}


public class ComparatorInterface {

	public static void main(String[] args) {
		LengthOrder l1 = new LengthOrder();
		Dec d1 = new Dec();
		TreeSet<String> t1 =new TreeSet<String> (l1);
		t1.add("yogeshwarn");
		t1.add("avi");
		t1.add("raam");
		ArrayList<String> a= new ArrayList<String> (t1);
		Collections.sort(a,l1);
		System.out.println(a);
//		System.out.println(t1);
//		System.out.println("---------------------------------------------");
//		
//		
//		TreeSet<String> t2 =new TreeSet<String> (d1);
//		t2.add("ram");
//		t2.add("avi");
//		
//		System.out.println(t2);

	}

}
