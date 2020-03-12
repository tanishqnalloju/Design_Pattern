package designpatternassignment.protype;

import java.util.ArrayList;
import java.util.List;

public class bookshop implements Cloneable
{
	private String ShopName;
	List<Book> books = new ArrayList<Book>();
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData()
	{
		for(int i=1;i<=10;i++)
		{
			Book a=new Book();
			a.setBid(i);
			a.setBname("Book"+i);
			getBooks().add(a);
		}
	}
	@Override
	public String toString() {
		return "bookshop [ShopName=" + ShopName + ", books=" + books + "]";
	}
	@Override
	protected bookshop clone() throws CloneNotSupportedException {
		
		bookshop shop =new bookshop();
		
		for(Book a : getBooks())
		{
			shop.getBooks().add(a);
		}
		return shop;
	}
	

	
}
