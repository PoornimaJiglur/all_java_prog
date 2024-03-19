package constructors;

public class ConstructorOverloading_Refrigerator {
	
	String brand;
	String color;
	String type;
	int price;
	ConstructorOverloading_Refrigerator(String brand)
	{
		this.brand=brand;
	}
	ConstructorOverloading_Refrigerator(String brand, String color)
	{
		this.brand=brand;
		this.color=color;
	}
	ConstructorOverloading_Refrigerator(String brand, String color,String type)
	{

		this.brand=brand;
		this.color=color;
		this.type=type;
	}
	ConstructorOverloading_Refrigerator(String brand, String color,String type,int price)
	{
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.price=price;
	}

	public static void main(String[] args) {
		
		ConstructorOverloading_Refrigerator R=new ConstructorOverloading_Refrigerator("LG","Red");
		System.out.println(R.brand);
		System.out.println(R.color);
		
	}

}
