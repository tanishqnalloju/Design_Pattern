package Template;

import java.util.Scanner;

public abstract class FileProcessor
{
public final void processFile()
{
boolean WriteToFile=false;
openFile();
readFile();
writeFile();
saveFile();
closeFile();
if(WriteToFile=UserWantsToWrite())
{
writeFile();
}
else
{
readFile();
}
if(WriteToFile)
saveFile();
closeFile();
}
public abstract void writeFile();
public abstract void readFile();
public void openFile()
{
System.out.println("Opening the File..........");
}
public void closeFile()
{
System.out.println("Closing the File..........");
}
public void saveFile()
{
System.out.println("Saving the File..........");
}
public boolean UserWantsToWrite()
{
Scanner sc=new Scanner(System.in);
System.out.println("Would u like to file or not");
System.out.println("If yes : y");
System.out.println("If no : n");
String ans=sc.next();
if(ans.equalsIgnoreCase("y"))
return true;
else
return false;
}
}