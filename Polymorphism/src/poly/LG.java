package poly;

public class LG extends Refrigerator{
	String brand2;
	String color2;
	String type2;
	int price2;
	

	
	public LG(String brand, String color, String type, int price, String brand2, String color2, String type2,
			int price2) {
		super(brand, color, type, price);
		brand = brand2;
		color = color2;
		type = type2;
		price = price2;
	}


	


	public static void main(String[] args) {
		Refrigerator r=new LG("LG-1","Red","Latest",3500,"LG-2","Blue","advanced",45000);
		System.out.println(r.brand);
		System.out.println(r.color);
		System.out.println(r.type);
		System.out.println(r.price);

	}

}
