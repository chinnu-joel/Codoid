package org.com;


import java.util.Set;
import java.util.TreeSet;


public class Q_20_NullpointerEception 
{
	private void m2() 
	{
		Set<Integer>s=new TreeSet();
		s.add(10);
		s.add(2);
		s.add(null);
		System.out.println(s);
		
		
	}

	public static void main(String[] args) 
	{
		Q_20_NullpointerEception c= new Q_20_NullpointerEception();
		c.m2();
	}
}
