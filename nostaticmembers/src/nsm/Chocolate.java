package nsm;

public class Chocolate {
	
	
		String brand;
		int price;
	
	public void chocky(String b,int p)
	{
		brand=b;
		price=p;
		
	}
	
	public void display()
	{
		System.out.println(brand);
		System.out.println(price);
	}

	public static void main(String[] args) {
		
Chocolate c=new Chocolate();
c.chocky("Meiji", 150);
c.display();


	}

}
