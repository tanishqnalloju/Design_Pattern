package Behavioural_Design_Pattern;

public class Light_State_Context 
{
	private Light_State ls;
	public Light_State_Context()
	{
		ls=new On_State();
	}
	public void setState(Light_State k)
	{
		ls=k;
	}
	public void light()
	{
		ls.light();
	}
}
