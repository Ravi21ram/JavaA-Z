package logical.one.test;

//import java.sql.Array;
import java.util.*;

public class RightRotateArray {
	public static int[] rightrotae( int[]num,int n)
	{
		for( int j=0;j<=n;j++)
		{
			int last=num[num.length-1];
			for( int i=num.length-1;i>=0;i--)
			{
				if(i-1>=0)
					
				{
					num[i]=num[i-1];
							
				}
			}
			num[0]=last;
		}
		System.out.println(Arrays.toString(num));
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5};
		rightrotae(array,5);

	}

}
