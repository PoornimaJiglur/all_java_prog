package nonprim_TypeCasting;

public class Pizza extends Food {
	char size;
	String toppings;
	String name;
	

	public Pizza(String restaurant, String ratings, String category, char size, String toppings, String name) {
		super(restaurant, ratings, category);
		this.size = size;
		this.toppings = toppings;
		this.name = name;
	}


	public static void main(String[] args) {
	Food F=new Pizza("Dominos","5 star","Veg",'L',"Alpino,Jalpino","Margarita");
	if(F instanceof Pizza)
	{
		Pizza P=(Pizza)F;
		System.out.println(P.restaurant);
		System.out.println(P.ratings);
		System.out.println(P.category);
		System.out.println(P.size);
		System.out.println(P.toppings);
		System.out.println(P.name);
		
	}
	else if (F instanceof Biriyani)
	{
		Biriyani B=(Biriyani)F;
		System.out.println(B.restaurant);
		System.out.println(B.ratings);
		System.out.println(B.category);
		System.out.println(B.price);
		System.out.println(B.quantity);
		
	}

	}

}
