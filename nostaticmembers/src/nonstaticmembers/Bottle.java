package nonstaticmembers;

public class Bottle {
	
	int qty;
	String material;
	String brand;
	

	public static void main(String[] args) {
		//System.out.println(qty);// Can not access directly
		Bottle b= new Bottle();
		System.out.println(b.qty);

	}

}
