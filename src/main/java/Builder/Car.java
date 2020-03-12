package Builder;

public class Car 
{
	private String Name;
	private int Capacity;
	private int Mileage;
	private int YearOfMgf;
	public Car(String name, int capacity, int mileage, int yearOfMgf) {
		super();
		this.Name = name;
		this.Capacity = capacity;
		this.Mileage = mileage;
		this.YearOfMgf = yearOfMgf;
	}
	@Override
	public String toString() {
		return "Car [Name=" + Name + ", Capacity=" + Capacity + ", Mileage=" + Mileage + ", YearOfMgf=" + YearOfMgf
				+ "]";
	}
	

}
