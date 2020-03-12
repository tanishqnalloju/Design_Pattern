package Structural_Design_Pattern;

public class Real implements Building
{
	private int floors;
	public Real(int floors)
	{
		this.floors = floors;
		display();
	}
	public void floors() 
	{
	   System.out.println("Displaying " + floors);
	}
	private void display()
	{
	      System.out.println("This is the real building");
	}
}
