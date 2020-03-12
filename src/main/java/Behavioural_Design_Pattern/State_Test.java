package Behavioural_Design_Pattern;

public class State_Test 
{
	public static void main(String args[])
	{
		Light_State_Context context=new Light_State_Context();
		context.light();
		context.setState(new Off_State());
		context.light();
	}
}
