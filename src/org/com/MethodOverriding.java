package org.com;
class Car
{
	void engine()
	{
		System.out.println("stock engine");
	}
}
class ModifiedCar extends Car
{
	void engine()
	{
		System.out.println("modify engine");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		
		
	Car ref= new ModifiedCar();
	ref.engine();
}
}
