package nonstaticmembers;

public class Car {
	
	String cname;
	String Color;
	int noOfcars;
	String brand;
	

	public static void main(String[] args) {
	
		 Car c=new Car();
		 System.out.println(c);
		 c.cname="swift";
		 c.Color="Red";
		 c.noOfcars=2;
		 c.brand="Suzuki";
		 System.out.println(c.cname);
		 System.out.println(c.Color);
		 System.out.println(c.noOfcars);
		 System.out.println(c.brand);
		 
		 Car c1=new Car();
		 System.out.println(c1);
		 c1.cname="Leaf";
		 c1.Color="White";
		 c1.noOfcars=1;
		 c1.brand="Nissan";
		 System.out.println(c1.cname);
		 System.out.println(c1.Color);
		 System.out.println(c1.noOfcars);
		 System.out.println(c1.brand);

	}

}
