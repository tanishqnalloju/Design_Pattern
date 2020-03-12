package Creational_Design_Pattern;
import java.util.*;

public class Singleton
{
	TreeSet<String> t=new TreeSet<String>();
	private static Singleton obj;
	private Singleton(){}
	public static Singleton getInstance()
    {
		if(obj==null)
			obj=new Singleton();
        return obj;
    }
	public void setData(String s)
	{
		t.add(s);
	}
	public void clearData()
	{
		t.clear();
	}
	public void removeData(String s)
	{
		if(t.remove(s))
			System.out.println("Item has been deleted");
		else
			System.out.println("Item cannot be detected");
	}
	public void getData()
	{
		System.out.println("Size is "+t.size());
		System.out.println("Items in the treeset are:");
		Iterator<String> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
