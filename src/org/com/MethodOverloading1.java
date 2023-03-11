package org.com;
class SearchEngine
{
	void searchOption(int a)
	{
		System.out.println("single integer argument");
	}
	void searchOption(int a, String b)
	{
		System.out.println("Two integer arguments");
	}
	void searchOption(String b, int a, char c)
	{
		System.out.println("Three integer arguments");
	}

}
public class MethodOverloading1 
{
	public static void main(String[] args) {
		SearchEngine ref= new SearchEngine();
		ref.searchOption(34346,"google");
	}
}
