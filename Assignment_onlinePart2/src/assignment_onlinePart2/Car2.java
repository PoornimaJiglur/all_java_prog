package assignment_onlinePart2;

public class Car2 extends Car1{
	int cc;
	
	
	public Car2(String brand, double price, int cc) {
		super(brand, price);
		this.cc = cc;
	}

	public void playMusic()
	{
		System.out.println("Melody song");
	}

	public static void main(String[] args) {
		
Car2 c=new Car2("Benz",500000.3,200);
c.drive();
c.playMusic();
System.out.println(c.brand);
System.out.println(c.price);
System.out.println(c.cc);


	}

}
