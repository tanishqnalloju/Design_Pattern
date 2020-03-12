package designpatternassignment.protype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		bookshop bs = new bookshop();
		bs.setShopName("Himalaya Book Store");
		bs.loadData();
		System.out.println(bs);
		
		bookshop bs1 = bs.clone();
		bs.getBooks().remove(4);
		System.out.println(bs);
		bs1.setShopName("General Book Store");
		System.out.println(bs1);
	}

}
