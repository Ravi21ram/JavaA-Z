package com.jsp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws Exception {
	File f1= new File("car.txt");
	
		FileReader fr =  new FileReader(f1);
		int ch=fr.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=fr.read();
					
		}
		fr.close();
//	this 	gives FileNotFoundException when calss not fpund
	
	}

}
