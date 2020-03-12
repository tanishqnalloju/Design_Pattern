package Template;

public class TemplateMainClass {

	public static void main(String[] args)
	{
		FileProcessor fp=new WordFileProcessor();
		fp.processFile();
		System.out.println("");
		System.out.println(".............................");
		FileProcessor fp1=new PDFFileProcessor();
		fp1.processFile();
	}

}
