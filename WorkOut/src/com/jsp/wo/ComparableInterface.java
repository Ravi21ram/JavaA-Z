package com.jsp.wo;

import java.util.*;

public class ComparableInterface {
	public static void main(String[] args) {
		LinkedHashSet<String> h1= new LinkedHashSet<String> ();
		h1.add("java");
		h1.add("sql");
		h1.add("springs");
		h1.add("hibernets");
		h1.add("web");
		//		System.out.println(((List) h1).get(3));
		ArrayList a1 = new ArrayList(h1);

		System.out.println(a1);
		System.out.println(a1.get(3));
	}

}
