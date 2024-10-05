package logical.one.test;

public class Febnoicsecries {
	public static void paldrom ( int num )
	{
		int temp =num;
		int res = 0;
		while( num >0)
		{
			int rem =num%10;
			res = res*10+rem;
			num=num/10;
		}
		if ( res==temp)
		{
			System.out.println(" paldromm num");
		}
		else 
		{
			System.out.println(" not paldromm num");
		}
	}
public static void main(String[] args) {
	Febnoicsecries.paldrom(126);
}
}
