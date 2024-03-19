package nonprim_TypeCasting;

public class Zomato extends FoodApplication {
	String offer;
	String restaurant;
	String ratings;
	

	public Zomato(String software, String CEO, int size, String offer, String restaurant, String ratings) {
		super(software, CEO, size);
		this.offer = offer;
		this.restaurant = restaurant;
		this.ratings = ratings;
	}


	public static void main(String[] args) {
		FoodApplication FA=new Zomato("APP","Amit",1000,"50%discoount","Meghana","5 Star");
		Zomato z=(Zomato)FA;
		System.out.println(z.software);
		System.out.println(z.CEO);
		System.out.println(z.size);
		System.out.println(z.offer);
		System.out.println(z.restaurant);
		System.out.println(z.ratings);

	}

}
