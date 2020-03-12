package Creational_Design_Pattern;

public class Audi implements Car
{
	String name;
	int cost;
	public Audi()
	{
		name="Audi";
		cost=150000;
	}
	
	public void getDetails()
	{
		System.out.println("Cost of "+name+" is "+cost);
	}
}
