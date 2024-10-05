package logical.one.test;

public class Paldromic {

	
		
		public static String  palindrome( int num)
		{
			int res =0 ;
			int temp = num;
			while (num >0)
			{
				int rem = num%10;
				res= res*10+rem;
				num=num/10;
			}
			//System.out.println(temp+" "+ res );
			if ( temp ==res)
			{
				System.out.println("palindrome");
				return "palindrome";
			}
			System.out.println("not a palinodroemm");
			return "not palinodrome";
		}
	
		public static void main(String[] args) {
			Paldromic.palindrome(1021);
			Paldromic.palindrome(1221);
		}

}
