package com.jsp.collection;

import java.util.*;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayLists {


	public static void main(String[] args) {

		ArrayList<String > a1 = new ArrayList<String>();
		a1.add("ravi");
		a1.add("hello");
		a1.add("abio");
		a1.add("yog");
		for(int i =0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}

		System.out.println(a1);




	}

}
