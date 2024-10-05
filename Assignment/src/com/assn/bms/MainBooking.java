package com.assn.bms;
class BookMyShow{
	public void booktickets() {
		System.out.println("          Tickets booked....Enjoy your movie...");
	}
}

class Theatre1 extends BookMyShow{
	String movie;
	String language;
	public Theatre1(String movie,String language,int seats) {
		System.out.println("movie name : "+movie);
		System.out.println("language : "+language);
		System.out.println("no of tickets : "+seats);
	}
	public void movie1(){
		System.out.println("movie name : "+movie);
	}
	public void language() {
		System.out.println("language : "+language);
	}
}

class Theatre2 extends BookMyShow{
	String movie;
	String language;
	public Theatre2(String movie,String language,int seats) {
		System.out.println("movie name : "+movie);
		System.out.println("language : "+language);
		System.out.println("no of tickets : "+seats);
	}
	public void movie1(){
		System.out.println("movie name : "+movie);
	}
	public void language() {
		System.out.println("language : "+language);
	}
}

class Theatre3 extends BookMyShow{
	String movie;
	String language;
	public Theatre3(String movie,String language,int seats) {
		System.out.println("movie name : "+movie);
		System.out.println("language : "+language);
		System.out.println("no of tickets : "+seats);
	}
	public void movie1(){
		System.out.println("movie name : "+movie);
	}
	public void language() {
		System.out.println("language : "+language);
	}
}

public class MainBooking {
	public static void main(String[] args) {
		
		Theatre1 t1=new Theatre1("avengers","english",2);
		t1.booktickets();
		System.out.println("------------------------------------------------------------");
		Theatre2 t2=new Theatre2("vikram","tamil",3);
		t2.booktickets();
		System.out.println("------------------------------------------------------------");
		Theatre3 t3=new Theatre3("sita ramam","malayalam",3);
		t3.booktickets();
		System.out.println("------------------------------------------------------------");
		Theatre3 t3_1=new Theatre3("kantara","kannada",3);
		t3_1.booktickets();
		
		
	}
}
