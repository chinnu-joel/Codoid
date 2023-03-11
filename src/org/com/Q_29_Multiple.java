package org.com;
interface Demo1
{
	void test();
	
}
interface Demo2
{
	
	void run();
}


class Test 
{
	void function()
	{
		System.out.println("function method");
	}
} 

public class Q_29_Multiple extends Test implements Demo1, Demo2
{
	public void test()
	{
		System.out.println("test method defenition is given in implementation class");
	}
	public void run()
	{
		System.out.println("run method defenition is given in implementation class");
	}
	public static void main(String[] args) 
	{
		Q_29_Multiple ref= new Q_29_Multiple();
		ref.function();
		ref.test();
		ref.run();

	}

}
