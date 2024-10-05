
package logical.one.test;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayShiftZeros {
	public static int[ ]shift( int []num) 
	{
		
		int[] res = new int [num.length];
		int x=0;
		for ( int i=0;i<num.length;i++)
		{
			if( num[i]!=0)
			{
				res[x]=num[i];
				x++;
			}
		}
//		System.out.print(Array.toString(res));
		return res;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int size= sc.nextInt();
		System.out.println("enter the size");
		int num[]= new int[size];
		System.out.println("enter int element");
		for ( int i=0; i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		sc.close();
//		int[] num = {1,2,0,9,0};
	System.out.println(shift(num));
		}
	
	public static void print(int[]n)
	{
		for( int i=0;i<n.length;i++)
		{
			System.out.println(n[i]+" ");
		}
		System.out.println();
	}

	

}
