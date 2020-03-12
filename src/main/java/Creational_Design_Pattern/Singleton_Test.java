package Creational_Design_Pattern;
import java.util.*;

public class Singleton_Test 
{
	public static void main(String args[])
	{
		Singleton h=Singleton.getInstance();
		Scanner s=new Scanner(System.in);
		int n,i;
		System.out.println("Number of entries ");
		n=s.nextInt();
		String st;
		for(i=0;i<n;i++)
		{
			st=s.next()+s.nextLine();
			h.setData(st);
		}
		h.getData();
		System.out.println("Enter the item to be deleted ");
		st=s.nextLine();
		h.removeData(st);
		h.getData();
		h.clearData();
		h.getData();
		s.close();
	}

}
