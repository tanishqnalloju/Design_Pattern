package Creational_Design_Pattern;

import java.util.Scanner;

public class Factory_Test 
{
	public static void main(String args[])
	{
		Car c=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the car whose details are to be revealed\n1)Maruthi\n2)Benz\n3)Audi");
		int choise=scan.nextInt();
		if(choise==1)
			c=new Maruthi();
		else if(choise==2)
			c=new Benz();
		else if(choise==3)
			c=new Audi();
		c.getDetails();
		scan.close();
	}
}
