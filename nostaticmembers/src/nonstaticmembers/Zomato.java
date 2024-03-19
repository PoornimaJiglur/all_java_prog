package nonstaticmembers;

public class Zomato {
	
	String restaurant;
	String food;
	int qty;
	
	public void order(String r, String f, int q)
	{
		restaurant=r;
		food=f;
		qty=q;
		System.out.println("Order successful");
				
	}
	public void cart()
	{
		System.out.println(restaurant);
		System.out.println(food);
		System.out.println(qty);
	}

	public static void main(String[] args) {
		Zomato z=new Zomato();
		z.order("Meghana's", "Biriyani", 50);
		z.cart();
		

	}

}
