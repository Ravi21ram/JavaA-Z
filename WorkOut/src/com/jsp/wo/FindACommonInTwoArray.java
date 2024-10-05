package com.jsp.wo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindACommonInTwoArray {

	public static void main(String[] args) {
		
int [] arr1= {1,2,3,4,5,6 };
int [] arr2= {4,5,6,12};
 List<Integer> common= new ArrayList<>();
 for( int i=0;i < arr1.length;i++)
 {
	 for( int j=0 ; j<arr2.length;j++)
	 {
		 if( arr1[i]==arr2[j])
		 {
			 common.add(j);
			 break;
		 }
				 
	 }
 }
 System.out.println(" the common elements are"+common);


	}

}
