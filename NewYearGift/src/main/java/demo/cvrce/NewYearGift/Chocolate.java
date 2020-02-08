package demo.cvrce.NewYearGift;

public class Chocolate extends Gift {
	int price,weight,tot_amt;
	String name;
	public Chocolate(int price, int weight, int tot_amt, String name) {
		super();
		this.price = price;
		this.weight = weight;
		this.tot_amt = tot_amt;
		this.name = name;
	}
	public int getpr()
	{
		return price;
	}
	public int getwt()
	{
		return price;
	}
	public String getname()
	{
		return name;
	}
	public int get_cal()
	{
		return tot_amt;
	}
	@Override
	public String toString() {
		return "Chocolate [price=" + price + ", weight=" + weight + ", tot_amt=" + tot_amt + ", name=" + name + "]";
	}
	

}
