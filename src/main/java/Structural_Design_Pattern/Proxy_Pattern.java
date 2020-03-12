package Structural_Design_Pattern;

public class Proxy_Pattern 
{
	public static void main(String[] args) 
	{
      	Building b = new Duplicate(10);

      b.floors(); 
      System.out.println("");
      
      b.floors(); 	
   }
}
