package constructors;

public class Hat4 {
	//parameterized argument constructor with using same name as NSV
	int price; //NSV
	String brand;
public Hat4(int price,String brand)
{
	this.price=price; // this keyword will refer to NSV and value will be stored
	this.brand=brand;

}

	public static void main(String[] args) {
		

		Hat4 h=new Hat4(100, "puma");
		System.out.println(h.price);
		System.out.println(h.brand);
	}

}