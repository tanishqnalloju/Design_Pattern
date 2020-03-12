package Builder;

public class Shop {

	public static void main(String[] args) 
	{
		Car a = new CarBuilder().setName("Ertiga").setMileage(20).getcar();
		System.out.println(a);

	}

}
