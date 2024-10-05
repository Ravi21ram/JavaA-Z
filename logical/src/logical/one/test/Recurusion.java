package logical.one.test;

public class Recurusion {

	public static int factorial(int n)
	{
		
	if (n == 0)
	{
	    return 1;
	}
	  else 
	  {
		  return(n * factorial(n-1)); 
	  }
		
//		if( n>=1)
//		{
//			return 1;
//		}
//		return (n*factorial(n--));
	       
	     
 
	}
public static void main(String[] args) {

		System.out.println(  Recurusion.factorial(5 )+" "  );
		
		
	}

}
