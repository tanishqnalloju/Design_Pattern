package Behavioural_Design_Pattern;

public class Fan_off implements Command
{
	Fan f;
	public Fan_off(Fan f)
	{
		this.f=f;
	}
	public void execute()
	{
		f.off();
	}
}
