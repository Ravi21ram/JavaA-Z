package logical.one.test;

public class SpliteText {
	public static void splite( String text) {
		String [] arr= text.split("  ");
		for( String print : arr)
		{
			System.out.println(print);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		splite("hii  how are you");
	}

}
