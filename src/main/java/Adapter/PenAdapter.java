package Adapter;

import Adapterexec.PilotPen;

public class PenAdapter implements Pen
{
	
	PilotPen pp=new PilotPen();
	public void write(String str) {
	// TODO Auto-generated method stub
	pp.mark(str);
	}

	

}
