package Behavioural_Design_Pattern;

public class Fan_on implements Command
{
	Fan f;
	public Fan_on(Fan f)
	{
		this.f=f;
	}
	public void execute()
	{
		f.on();
	}
}
