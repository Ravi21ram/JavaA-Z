package com.jsp.wo;

interface Map
{
	public void mapmethod();
}
class Uber implements Map
{
	@Override
	public void mapmethod()
	{
		System.out.println(" uber need the map");
	}

}
class Rapido implements Map
{
	@Override
	public void mapmethod()
	{
		System.out.println(" rapido need the map");
	}
}
class User
{
	public void mainmethod(Map m1)
	{
		m1.mapmethod();
	}
}
public class AbstrationRealtime {
public static void main(String[] args) {
//		AbstrationRealtime a1= new AbstrationRealtime();
		User u1= new User();
		Uber u = new Uber();
		u1.mainmethod(u);
		Rapido r = new Rapido();
		u1.mainmethod(r);
	}




























}
