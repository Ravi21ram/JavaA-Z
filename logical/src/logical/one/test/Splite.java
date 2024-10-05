package logical.one.test;

public class Splite {

	public static void splite( String text) {
		String [] arr= text.split("[.]");
		boolean f =true;
		for( String p: arr)
		{
			int n = Integer.parseInt(p);
			System.out.println(p);
			if( n>=48 || n<=57)
			{
				System.out.println("true");
			}
			else
			{
				f=false;
				System.out.println(f);
			}
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		splite("1.2");

	}

}
