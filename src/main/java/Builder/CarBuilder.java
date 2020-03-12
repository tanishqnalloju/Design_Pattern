package Builder;

public class CarBuilder
{
	private String Name;
	private int Capacity;
	private int Mileage;
	private int YearOfMgf;
	public CarBuilder setName(String name) {
		this.Name = name;
		return this;
	}
	public CarBuilder setCapacity(int capacity) {
		this.Capacity = capacity;
		return this;
	}
	public CarBuilder setMileage(int mileage) {
		this.Mileage = mileage;
		return this;
	}
	public CarBuilder setYearOfMgf(int yearOfMgf) {
		this.YearOfMgf = yearOfMgf;
		return this;
	}
	
	public Car getcar()
	{
		return new Car(Name, Capacity, Mileage, YearOfMgf);
	}

}
