package com.sp;

import java.io.PushbackInputStream;

public class Stack {
	static int[] stack;
	static int top;


	static void createStack( int size)
	{
		stack  = new int[size];
		top=-1;
		System.out.println(" stack has been created in the size of : "+size);	
	}
	public static void  push( int element)
	{
		if( top==stack.length-1)
		{
			System.out.println(" Stack is over flow............");
		}
		else
		{
			top++;
			stack [top]=element;
			System.out.println( element +" is added  "); 
		}	 
	}
	public static void display()
	{
		if(top==-1) {
			System.out.println(" stack is empty");
		}
		else
		{
			for( int i=top;i>=0;i--)
			{
				System.out.println(stack[i]+" last in first out");
			}
		}
		System.out.println("                   ");
	}
	public static void pop()
	{
		if( top==-1)
		{
			System.out.println(" the stack is empty or STACK UNDER FLOW");
		}
		else
		{
			stack[top]=0;// default value of int array is zero
			top--;
			System.out.println(" removed successfully");

			//		  for( int i =top;i>=0;i--)
			//		  {
			//			  System.out.println(" the element is deleted  " + stack[i]);
			//		  } delete one by one
		}
	}
	public static boolean isEmpty()
	{
		if( top==-1)
		{
			return true;
		}
		return false;

	}
	public static boolean isFull()
	{
		if( top==stack.length-1)
		{
			return true;
		}
		return false;

	}
	public static void main(String[] args) {
		createStack(5);
		push(2);
		push(3);
		push(1);
		push(6);
		push(8);
		pop();
		System.out.println(isEmpty());
		System.out.println(isFull());
		display();
	}

}
