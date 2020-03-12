package Composite;

public class CompositeTest {

	public static void main(String[] args)
	{
		Component hd=new Leaf(2000,"HDD");
		Component mouse=new Leaf(1500,"Mouse");
		Component ram=new Leaf(2200,"Ram");
		Component kd=new Leaf(500,"KeyBoard");
		Component mon=new Leaf(3000,"Monitor");
		Component cpu=new Leaf(2500,"CPU");
		Composite peri=new Composite("Peripherals");
		Composite cabinet=new Composite("Cabinet");
		Composite mb=new Composite("MotherBoard");
		Composite computer=new Composite("Computer");
		peri.addComponents(mouse);
		peri.addComponents(kd);
		mb.addComponents(ram);
		mb.addComponents(cpu);
		cabinet.addComponents(hd);
		cabinet.addComponents(mb);
		computer.addComponents(peri);
		computer.addComponents(cabinet);
		computer.showPrice();
		
	}

}
