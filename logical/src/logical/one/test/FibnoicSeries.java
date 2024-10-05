package logical.one.test;

public class FibnoicSeries {
	static int n1=0;
	static 	int n2=1;
	static	int n3=0 ;

	public  static void series( int num)
	{
		if( num>0)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
			if( n3<=10)
			{
				System.exit(0);
				
			}
			
			num--;
			series(num);
		}
		
	}
	

	public static void main(String[] args) {
		System.out.print("0 1");
		
		series(10-2);
	}
}
