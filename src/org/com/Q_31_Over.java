package org.com;
class Telecomm_Regulatory_Dept
{
	void network()
	{
		System.out.println("network service");
	}
	void rules()
	{
		System.out.println("rules and regulations of TRAI");
	}
}
class Airtel extends Telecomm_Regulatory_Dept
{
	//method overloading
	void plan(int primaryPlan)
	{
		System.out.println("Plan sucessfully updated with "+ primaryPlan);
	}
	void plan(int primaryPlan,int secondPlan)
	{
		System.out.println("Plan sucessfully updated with "+ primaryPlan);
		System.out.println("secondary plan activated for "+ secondPlan);
	}
	//method overriding
	void network()
	{
		System.out.println("Override Telecomm_Regulatory_Dept and implement my own company name");
	}
}

public class Q_31_Over {

	public static void main(String[] args) {
		Airtel ref= new Airtel();
		ref.plan(799,28);
		ref.network();
	}
		

}
