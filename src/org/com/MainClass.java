package org.com;
class BlockerException extends Exception
{
	
}
class Paytm
{
	void pay(boolean paid) throws BlockerException
	{
		if (paid==true) 
		{
			System.out.println("payment successful");
		} else 
		{
			throw new BlockerException();
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		Paytm ref=new Paytm();
		try {
		ref.pay(false);
		}
		catch (Exception e) 
		{
			System.out.println("exception occured in");
			
		}

	}

}
