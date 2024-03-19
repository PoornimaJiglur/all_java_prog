package chaining;

public class Puma extends Shoebrand{
	
	String material;
	String color;
	



	public Puma(double price, int size, String material, String color) {
		super(price, size);
		this.material = material;
		this.color = color;
	}
	

	public static void main(String[] args) {
		Puma p=new Puma(15000,1,"Leather","Black");
		System.out.println(p.price);
		System.out.println(p.size);
		System.out.println(p.material);
		System.out.println(p.color);

	}

}
