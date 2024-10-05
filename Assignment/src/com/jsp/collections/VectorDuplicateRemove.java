package com.jsp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

public class VectorDuplicateRemove implements Comparable<VectorDuplicateRemove > {
	
	@Override 
	public int compareTo(VectorDuplicateRemove e1 ) {
		return 0;
	}

	public static void main(String[] args) {
		HashSet < Integer> v1 = new HashSet  < Integer> ();
		
		v1.add(1);
		v1.add(6);
		v1.add(3);
		v1.add(1);
		v1.add(999);
		v1.add(00);
		v1.add(8);
		v1.add(3);
		v1.add(1);
		v1.add(1);
		System.out.println(" without sotr and having dublicate"+v1);
		ArrayList  < Integer> a1 = new ArrayList < Integer> (v1);
		Collections.sort(a1);
		System.out.println("after sort and deleting duplicates"+a1);
		
		
		
		
		

	}

	

}
