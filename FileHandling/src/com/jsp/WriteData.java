package com.jsp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
		File f1 = new File("Student.txt");
		FileWriter fw= null;
		try {
			fw = new FileWriter(f1);
			fw.write("file programing");
			fw.flush();
			System.out.println(" file is done");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
