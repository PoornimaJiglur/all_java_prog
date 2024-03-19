package inheritance_package;

public class Truck extends Vehicle{
	//Hierarchical  level inheritance
	String model="Bajaj 001";
	public void drive()
	{
		System.out.println("Kashmir");
		
	}
	public static void main(String[] args)
	{
		Bike b=new Bike();
		System.out.println(b.speed);
		b.insurance();
		System.out.println(b.brand);
		b.ride();
		Truck t=new Truck();
		t.drive();
		System.out.println(t.model);
	}

}
