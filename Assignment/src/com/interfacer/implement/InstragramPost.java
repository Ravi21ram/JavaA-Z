package com.interfacer.implement;
interface post{
	public void like();
	public void comment();
	public void share();
}
interface photoedit{
	public void song();
	public void location();
	
}
interface videoedit{
	public void mute();
	public void song();
	public void filter();
}
class photo implements post,photoedit{
	public void like() {
		System.out.println("like");
	}
	public void comment()
	{
		System.out.println("comment");
	}
	public void share()
	{
		
			System.out.println("share");
	}
	public void song()
	{
		System.out.println("song");
	}
	public void location()
	{
		System.out.println("location");
	}
	
}
class video implements post,videoedit{
	public void like() {
		System.out.println("like");
	}
	public void comment()
	{
		System.out.println("comment");
	}
	public void share()
	{
		
			System.out.println("like");
	}
	public void mute()
	{
		System.out.println("mute");
	}
	public void song()
	{
		System.out.println("song");
	}
	public void filter()
	{
		System.out.println("filter");
	}
}

public class InstragramPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		video v1 = new video();
		v1.like();
		v1.comment();
		v1.filter();
		v1.song();
		v1.mute();
		v1.share();
		System.out.println("_________________________");
		
		photo p1 = new photo();
		p1.like();
		p1.comment();
		p1.share();
		p1.song();
		p1.location();

	}

}
