package demo.cvrce.NewYearGift;

public class Sweet extends Gift {
int price,weight;
String name;
	public Sweet(int price,int weight,String name) {
		super();
		this.price=price;
		this.weight=weight;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public int getpr()
	{
		return price;
	
	}
	public int getwt()
	{
		return weight;
	}
	public String getname()
	{
		return name;
	}
	@Override
	public String toString() {
		return "Sweet [price=" + price + ", weight=" + weight + ", name=" + name + "]";
	}
	

}
