package com.jsp.maps;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
//class Id
//{
//
//}

class UserObjesct implements Comparable<UserObjesct> 
{
	String name;
	String pw;
	int id;
	long phonenumber;
	public UserObjesct(String name, String pw, int id, long phonenumber) {
		super();
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.phonenumber = phonenumber;
	}
	@Override
	public int compareTo(UserObjesct o1)
	{
		return this.name.compareTo(o1.name);
	}
	public String toString()
	{
		return "name is  "+name+"pw is "+pw+"id is "+id+"phone number is " +phonenumber;
	}

}


public class TreeMapExxam {
	public static void main(String[] args) {
		
		UserObjesct u1= new UserObjesct("ravi","abc123", 7, 1223l);
		UserObjesct u2= new UserObjesct("Abc","jdfn123", 2, 1223l);
		UserObjesct u3= new UserObjesct("ram","hi123", 3, 1223l);
		UserObjesct u4= new UserObjesct("yog","you", 4, 1223l);
		TreeMap<UserObjesct,String> t1= new TreeMap<UserObjesct,String>();

		t1.put(u4, "bai");
		t1.put(u1, "girl");
		t1.put(u2, "lion");
		t1.put(u3, "tiger");
		Set<UserObjesct>  n=t1.keySet();
		for( UserObjesct m:n )
		{
			System.out.println(m  +"  ------->>>>>>>>>>>> "+t1.get(m));
		}
//		Iterator <UserObjesct> i =t1.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
	}





















}
