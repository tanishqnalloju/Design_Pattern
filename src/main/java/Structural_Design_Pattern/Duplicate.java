package Structural_Design_Pattern;

public class Duplicate implements Building
{
	private int floors;
	private Real realFloors;
	public Duplicate(int floors)
	{
		this.floors = floors;
	}
	public void floors() 
	{
		if(realFloors==null)
			realFloors=new Real(floors);
		realFloors.floors();
	}

}
