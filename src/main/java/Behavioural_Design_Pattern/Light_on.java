package Behavioural_Design_Pattern;

public class Light_on implements Command
{
	Light l;
	public Light_on(Light l)
	{
		this.l=l;
	}
	public void execute()
	{
		l.on();
	}
}
