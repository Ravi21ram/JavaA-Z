package logical.one.test;

public class Greenticket {
	
		public int greenTicket( int a, int b, int c) {
			if( a!=b && a!=c && b!=c)
			{
				System.out.println("0");
				return 0;
			}
				
			
			
			else if(a==b && a==c && c==b) 
			{
				System.out.println("20");
				return 20;
			}
			
			else {
			return 10;
}
				
		}
		
	
public static void main(String[] args)
{
	Greenticket n1= new Greenticket();
 n1.greenTicket(10, 10, 10);
}
}
