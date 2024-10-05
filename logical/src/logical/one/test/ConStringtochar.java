package logical.one.test;
//  
public class ConStringtochar {
	public static void uppertolower( String text)
	{
		String res="";
		for( int i=0;i<text.length();i++)
		{
			if(text.charAt(i)>=65 && text.charAt(i)<=90 )
			{
				res=res+(char) (text.charAt(i)+32);
			}
			else
			{
				res=res+text.charAt(i);
			}
			
		}
		System.out.println(res);
	}
	public static void lowertoUpper( String text)
	{
		String res="";
		for( int i=0;i<text.length();i++)
		{
			if(text.charAt(i)>=97 && text.charAt(i)<=122)
			{
				res=res+(char) (text.charAt(i)-32);
			}
			else
			{
				res=res+text.charAt(i);
			}
			
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		uppertolower("RAVI");//
		lowertoUpper("ravi");
	}

}
