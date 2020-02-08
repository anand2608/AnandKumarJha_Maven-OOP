package demo.cvrce.NewYearGift;
import java.util.*;
public class GiftFinal {
static ArrayList<Sweet>sweets=new ArrayList<Sweet>();
static ArrayList<Chocolate>chocolates=new ArrayList<Chocolate>();
static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		inputSweets();
		inputChocloates();
		while(true)
		{
			System.out.println("MENU");
			System.out.println("1.display Chocolates and Sweets");
			System.out.println("2.display Weight Of The Gift");
			System.out.println("3.display Candies In The Gift");
			System.out.println("4.Filter");
			System.out.println("5.Exit()");
			int a=sc.nextInt();
			 switch(a)
			 {
			 case 1:
				 display();
				 break;
			 case 2:
				 System.out.println("The total weight of the gift:"+calcWeight());
				 break;
			 case 3:
				 System.out.println("The Candies are:");
				 candyDisplay();
				 break;
			 case 4:
				 System.out.println("Filter the chocolates and sweets according to: 1.Price 2.Weight");
				 int ch=sc.nextInt();
				 filter(ch);
				 break;
			 case 5:
				 System.out.println("ThankYou");
				 System.exit(0);
			default:
				 System.out.println("Invlaid Choice!!Try Again!!");
			 }
		}
	}
	public static void inputSweets()
	{
		System.out.println("input no of sweets:");
		for(int n=sc.nextInt();n>0;n--)
		{
			System.out.println("input weight of the sweet:");
			int weight=sc.nextInt();
			System.out.println("input price of the sweet:");
			int price=sc.nextInt();
			System.out.println("input name of the sweet:");
			String name=sc.next();
			Sweet sweet=new Sweet(price,weight,name);
			sweets.add(sweet);
		}
	}
	
	
	public static void inputChocloates()
	{
		System.out.println(" no of chocolates:");
		for(int n=sc.nextInt();n>0;n--)
		{
			System.out.println("input weight of the chocolate:");
			int weight=sc.nextInt();
			System.out.println("input price of the chocolate:");
			int price=sc.nextInt();
			System.out.println("input type of chocolate: 1.Candy 2.Chocolate");
			int cat=sc.nextInt();
			System.out.println("input name of the chocolate:");
			String name=sc.next();
			Chocolate chocolate=new Chocolate(price,weight,cat,name);
			chocolates.add(chocolate);
		}
	}		
	public static int calcWeight()
	{
		int totalWeight=0;
		for(Chocolate choco:chocolates)
			totalWeight+=choco.getwt();
		for(Sweet sweet:sweets)
			totalWeight+=sweet.getwt();
		return totalWeight;
	}
	public static void candyDisplay()
	{
		for(Chocolate choco:chocolates)
		{
			if(choco.get_cal()==1)
				System.out.println(choco.toString());
		}
	}
	public static void filter(int ch) 
	{
		int lower,higher;
		if(ch==1)
		{
			System.out.println("lower price limit:");
			lower=sc.nextInt();
			System.out.println("upper price limit:");
			higher=sc.nextInt();
			for(Chocolate choco:chocolates)
			{
				if(choco.getpr()>=lower&&choco.getpr()<=higher)
					System.out.println(choco.toString());
			}
			for(Sweet sweet:sweets)
			{
				if(sweet.getpr()>=lower&&sweet.getwt()<=higher)
					System.out.println(sweet.toString());
			}
		}
		else
		{
			System.out.println("lower weight limit:");
			lower=sc.nextInt();
			System.out.println("weight limit:");
			higher=sc.nextInt();
			for(Chocolate choco:chocolates)
			{
				if(choco.getwt()>=lower&&choco.getwt()<=higher)
					System.out.println(choco.toString());
			}
			for(Sweet sweet:sweets)
			{
				if(sweet.getwt()>=lower&&sweet.getwt()<=higher)
					System.out.println(sweet.toString());
			}
		}
	}
	public static void display()
	{
		for(Chocolate choco:chocolates)
				System.out.println(choco.toString());
		for(Sweet sweet:sweets)
				System.out.println(sweet.toString());
	}
}