package nonprim_TypeCasting;

public class Jewelery extends GoldJewel {
	String jeweltype;
	int price;
	
	
	

	public Jewelery(String type, int quantity, String jeweltype, int price) {
		super(type, quantity);
		this.jeweltype = jeweltype;
		this.price = price;
	}




	public static void main(String[] args) {
		GoldJewel G=new Jewelery("Necklace", 3,"PureGold",4000000);
		Jewelery J=(Jewelery)G;
		System.out.println(J.type);
		System.out.println(J.quantity);
		System.out.println(J.jeweltype);
		System.out.println(J.price);

	}

}
