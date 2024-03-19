package constructors;

public class Laptop {
	String brand;
	int price;
	
	Laptop()
	{
		System.out.println("Laptop is amazing");
	}
	

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.brand="Dell";
		l.price=50000;
		System.out.println(l.brand);
		System.out.println(l.price);
		Laptop l1=new Laptop();
		l1.brand="HP";
		l1.price=30000;
		System.out.println(l1.brand);
		System.out.println(l1.price);
	}

}
