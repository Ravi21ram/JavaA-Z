package logical.one.test;

import java.util.Scanner;

public class DuplicatesInAnArray {


	public static void check(int []num)
	{
		int pair=0;
		for (int i=0;i<=num.length-1;i++)
		{
			int count =0;
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					num[j]=-1;
				}
			}
			if(num[i]!=-1)
	         {
				pair=pair+count/2;
	       }
			System.out.print(num[i]+  " "+pair);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int n[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<=n.length-1;i++)
		{
			 n[i]=sc.nextInt();
		}
		DuplicatesInAnArray.check(n);
		
		

	}

}
