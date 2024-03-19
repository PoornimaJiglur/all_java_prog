package chaining;

public class Earphone extends Product {
	String brand;
	double price;
	
	

	public Earphone(String type, String mfdate, String expdate, String brand, double price) {
		super(type, mfdate, expdate);
		this.brand = brand;
		this.price = price;
	}



	public static void main(String[] args) {
		Earphone e=new Earphone("electronics","2/1/24","13/2/24","Apple",35000.0);
		System.out.println(e.type);
		System.out.println(e.mfdate);
		System.out.println(e.expdate);
		System.out.println(e.brand);
		System.out.println(e.price);
		
		Earphone e1=new Earphone("Electrical","22/11/24","13/12/24","LG",55000.0);
		System.out.println(e.type);
		System.out.println(e.mfdate);
		System.out.println(e.expdate);
		System.out.println(e.brand);
		System.out.println(e.price);
	}

}
