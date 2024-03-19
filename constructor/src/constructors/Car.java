package constructors;

public class Car {
	
	String brand;
	String color;
	double price;
	int cc;
	public Car(String brand,String color,double price, int cc)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.cc=cc;
	}
	

	public static void main(String[] args) {
	Car c1=new Car("BMW","black",5000000,5000);
	System.out.println(c1.brand);
	System.out.println(c1.cc);
	System.out.println(c1.color);
	System.out.println(c1.price);
	
	}

}
