package org.com;
class Company
{
	void logo(int a)
	{
		System.out.println("single integer argument");
	}
	void logo(int a, int b)
	{
		System.out.println("Two integer arguments");
	}
	void logo(int a, int b, int c)
	{
		System.out.println("Three integer arguments");
	}
}

public class MethodOverloadingByNoOfArguments {
	public static void main(String[] args) {
		Company ref= new Company();
		ref.logo(34,56,98);
	}
}
