package com.jsp.collection;

import java.util.ArrayList;
import java.util.List;

public class MethodsInArrayList {
public static void main(String[] args) {
	List<Object> a1 = new ArrayList<Object>();
	a1.add(" hello");
	a1.clear();
	System.out.println(a1);
	a1.add(" ravi");
	a1.add('a');
	a1.add(1);
	a1.add(null);
	a1.add(1);
	a1.add(1);
	a1.add(0, a1);
	a1.add(1, a1);
	a1.remove(1);
	System.out.println(a1);
	
	a1.addAll(a1);
	
	System.out.println(a1.get(1));
}
}
