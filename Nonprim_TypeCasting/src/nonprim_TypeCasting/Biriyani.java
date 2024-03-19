package nonprim_TypeCasting;

public class Biriyani extends Food{
	int price;
	int quantity;
	public Biriyani(String restaurant, String ratings, String category, int price, int quantity) {
		super(restaurant, ratings, category);
		this.price = price;
		this.quantity = quantity;
	}
	

}
