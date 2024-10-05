package com.assn.bms;

public class StringSorting {

	public static void stringsorting( )
	{
		String eg="yxzxzy";
		char arr[]= eg.toCharArray();
		char temp='b';

		int i=0;
		while ( i< arr.length)
		{
			int j= i+1;
			while( j<arr.length)
			{
				if ( arr[j] < arr[i])

				temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;

			}
			j +=1;
		}
		i+=1;

		System.out.println( "  the sorted order" + arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSorting.stringsorting();

	}

}
