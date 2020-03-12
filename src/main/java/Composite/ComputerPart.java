package Composite;
import java.util.ArrayList;
import java.util.List;

interface Component
{
void showPrice();
}
class Leaf implements Component
{
int Price;
String name;

public Leaf(int price, String name) {
super();
Price = price;
this.name = name;
}

public void showPrice()
{
System.out.println(name+" : "+Price);
}

}
class Composite implements Component
{
String name;

public Composite(String name) {
super();
this.name = name;
}
List<Component> components=new ArrayList<Component>();
public void addComponents(Component com)
{
components.add(com);
}
public void showPrice()
{
System.out.println(name);
for(Component c:components)
{
c.showPrice();
}
}
}
