package Behavioural_Design_Pattern;

public class Light_off implements Command
{
	Light l;
	public Light_off(Light l)
	{
		this.l=l;
	}
	public void execute()
	{
		l.off();
	}
}
