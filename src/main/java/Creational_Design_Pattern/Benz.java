package Creational_Design_Pattern;

public class Benz implements Car
{
	String name;
	int cost;
	public Benz()
	{
		name="Benz";
		cost=100000;
	}
	
	public void getDetails()
	{
		System.out.println("Cost of "+name+" is "+cost);
	}
}
