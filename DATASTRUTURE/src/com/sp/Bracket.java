package com.sp;

public class Bracket {
	static  char[] stack;
	static int top;
	public static void check ( String brk)
	{
		if( brk.length()%2==0)
		{
			for( int i=0; i>=brk.length()-1;i++)
			{
				if(brk.charAt(i)=='(')
				{
					
				}
			}
		}
		else
		{
			System.out.println(" not equal ");
		}
	}
//	static void createStack( int size)
//	{
//		stack  = new char[size];
//		top=-1;
//		System.out.println(" stack has been created in the size of : "+size);	
//	}
	public static void  push( char element)
	{
		stack[top]= element;
		top++;
		System.out.println(stack[element]);
	
	
	}

	public static void main(String[] args) {
		 
//		push('(');
//		push('(');
//		push('(');

	}

}
