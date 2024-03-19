package nonprim_TypeCasting;

public class Heels extends Sandal {
	
	String heelht;
	int price;
	
	

	public Heels(String type, String qlty, String heelht, int price) {
		super(type, qlty);
		heelht = heelht;
		this.price = price;
	}



	public static void main(String[] args) {
	Sandal S=new Heels("Leather","Super","4cm",1200);
	Heels H=(Heels)S;
	System.out.println(H.type);
	System.out.println(H.qlty);
	System.out.println(H.heelht);
	System.out.println(H.price);
	}

}
