package Structural_Design_Pattern;

public class Activity 
{
	Calculator c;
	public void addOperation()
	{
		c=new Add();
		c.operation();
	}
	public void subtractOperation()
	{
		c=new Subtract();
		c.operation();
	}
	public void multiplyOperation()
	{
		c=new Multiply();
		c.operation();
	}
	public void divideOperation()
	{
		c=new Divide();
		c.operation();
	}
}
