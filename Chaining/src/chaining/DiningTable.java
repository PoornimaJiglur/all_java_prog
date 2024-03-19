package chaining;

public class DiningTable {
	int price;
	String material;
	

	public DiningTable(int price, String material) {
		super();
		this.price = price;
		this.material = material;
	}


	public static void main(String[] args) {
		DiningTable d=new DiningTable(25000,"wood");
		System.out.println(d.price);
		System.out.println(d.material);
		

	}

}
