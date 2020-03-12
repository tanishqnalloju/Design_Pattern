package Behavioural_Design_Pattern;

public class RemoteControl 
{
	Command c;
	public void setCommand(Command c)
	{
		this.c=c;
	}
	public void buttonPressed()
	{
		c.execute();
	}
}
