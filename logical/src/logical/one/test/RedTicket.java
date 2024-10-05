package logical.one.test;

public class RedTicket {
	public int redtickets ( int a, int b, int c)
	{
		if ( a==2&& b==2 && c==2)
		{
			System.out.println(" 10");
			return 10;
		}
		else if ( a==b && b==c && a==c)
		{
			System.out.println("5");
			return 5;
		}
		else if ( a!= b && a!=c )
		{
			System.out.println("1");
			return 1;
		}
		//else 
		//{
		//	System.out.println("0");
		// 0;
		//}
		System.out.println("0");
		return 0;
	}
	public static void main(String[] args) {
		RedTicket r1= new RedTicket ();
		r1.redtickets(2, 2, 2);
		r1.redtickets(2, 2, 1);
		r1.redtickets(5,5, 5);
	}

}
