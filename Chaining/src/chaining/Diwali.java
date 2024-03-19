package chaining;

public class Diwali extends Festival{
	String food;
	Diwali(String food)
	{
		super("17/1/24","India","All");
		this.food=food;
	}
	
	
	

	public static void main(String[] args) {
	
		Diwali d1=new Diwali("Chakli");
		System.out.println(d1.date);
		System.out.println(d1.place);
		System.out.println(d1.religion);
		System.out.println(d1.food);
		Diwali d2=new Diwali("Sweet");
		System.out.println(d2.date);
		System.out.println(d2.place);
		System.out.println(d2.religion);
		System.out.println(d2.food);
		
	}

}
