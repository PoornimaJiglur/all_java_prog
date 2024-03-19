package poly;

public class Refrigerator {
	
		String brand;
		String color;
		String type;
		int price;
		
	
		Refrigerator(String brand)
		{
			this.brand=brand;
		}
		Refrigerator(String brand, String color)
		{
			this(brand);
			this.color=color;
		}
		Refrigerator(String brand, String color,String type)
		{

			this(brand,color);
			this.type=type;
		}
		Refrigerator(String brand, String color,String type,int price)
		{
			this(brand,color,type);
			this.price=price;
		}

}


