package Behavioural_Design_Pattern;

public class Remote_Test 
{
	public static void main(String args[])
	{
		RemoteControl rc=new RemoteControl();
		Light l=new Light();
		Fan f=new Fan();
		rc.setCommand(new Light_on(l));
		rc.buttonPressed();
		rc.setCommand(new Light_off(l));
		rc.buttonPressed();
		rc.setCommand(new Fan_on(f));
		rc.buttonPressed();
		rc.setCommand(new Fan_off(f));
		rc.buttonPressed();
	}
}
