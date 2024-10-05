package com.jsp.maps;

import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer ,String> s1 = new TreeMap<Integer ,String>();
		s1.put(1, "one");
		s1.put(2, "two");
		s1.put(3, "three");
		s1.put(4, "four");
		System.out.println(s1);
		Set <Integer> K1=s1.keySet();
		for(Integer n: K1)
		{
			System.out.println(n + "--->"  +s1.get(n));
		}




	}

}
