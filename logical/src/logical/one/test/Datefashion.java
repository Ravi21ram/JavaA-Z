package logical.one.test;

public class Datefashion {
	public int datefashion( int you , int date)
	{
		if ( date >= 8 || you >=8 )
		{
			System.out.println("2");
			return 2;
		}
		else if( date <=2 || you <=2 )
		{
			System.out.println("0");
			return 0;
		}
		else {
			System.out.println("1");
			return 1;
		}
	}
	public static void main(String[] args) {
		Datefashion d1= new Datefashion();
		d1.datefashion(5, 1);
	}
}
