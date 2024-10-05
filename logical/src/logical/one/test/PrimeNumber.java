package logical.one.test;

public class PrimeNumber {
	public static int prime( int n)
	{
		int p=0;
		for( int i=2; ; i++)
		{
			int count =0;
			for ( int j=2; j<i-1;j++  )
			{
				if( i%j==0)
				{
					count++;
				}
				
			}
			if( count==0)
			{
				System.out.println(" prime number" +i);
				break;
				
			}
			else
			{
				System.out.println(" not  prime number"+i);
			}
			
		}
//		if()
//		return sum;
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.print(PrimeNumber.prime( 1,10));
	}

}
