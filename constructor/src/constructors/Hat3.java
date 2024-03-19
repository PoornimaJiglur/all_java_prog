package constructors;

public class Hat3 {
	//parameterized argument constructor with using same name as NSV
	int price; //NSV
	String brand;
public Hat3(int price,String brand)
{
	price=price; // global variable reference will be stored always 
	brand=brand;

}

	public static void main(String[] args) {
		

		Hat3 h=new Hat3(100, "puma");
		System.out.println(h.price);
		System.out.println(h.brand);
	}

}