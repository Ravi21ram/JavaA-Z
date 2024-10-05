package com.jsp.wo;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
public class LibariesBook implements Comparator<LibariesBook> {
	private String bookName;
	private String bookid;
	private int year;


	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int compare(LibariesBook y1,  LibariesBook y2)
	{
		return y2.year- y1.year;
	}
	public String toString()
	{
		return  " book name , id, year are  " + bookName+"  "+ bookid+"   "+year;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LibariesBook l1= new LibariesBook();
		l1.setBookName(" avb");
		l1.setBookid("200");
		l1.setYear(10000);
		LibariesBook l2= new LibariesBook();
		l2.setBookName(" xyz");
		l2.setBookid("100");
		l2.setYear(5000);
		LibariesBook l3= new LibariesBook();
		l3.setBookName(" hex");
		l3.setBookid("400");
		l3.setYear(3200);
		TreeSet <LibariesBook> t1= new TreeSet <LibariesBook>(l2);
		t1.add(l1);
		t1.add(l2);
		t1.add(l3);
		Iterator <LibariesBook> i= t1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}


	}

}



























