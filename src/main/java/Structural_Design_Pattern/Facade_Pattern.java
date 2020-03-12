package Structural_Design_Pattern;

public class Facade_Pattern 
{
	public static void main(String args[])
	{
		Activity a=new Activity();
		a.addOperation();
		a.subtractOperation();
		a.multiplyOperation();
		a.divideOperation();
	}
}
