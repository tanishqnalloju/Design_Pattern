package Adapter;
import Adapterexec.PilotPen;

public class School {


	public static void main(String[] args) 
	{
		//PilotPen pp=new PilotPen();
		Pen p=new PenAdapter();
		Assignmentwork aw=new Assignmentwork();
		aw.setP(p);
		aw.writeAssignment("Hi hello I'm learning how to implement adapter pattern");	
	}

}
