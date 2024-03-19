package nsv;

public class Watch {
	
	String brand;
	String color;
	int price;
	
	

	public static void main(String[] args) {
		Watch w=new Watch();
		w.brand="Titan";
		w.color="silver";
		w.price=10000;
		System.out.println(w.brand);
		System.out.println(w.color);
		System.out.println(w.price);
	}

}
