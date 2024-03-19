package inheritance_package;

public class Cow extends Animal {
	// single level inheritance
	String food="grass";
	public void use()
	{
		System.out.println("provides milk");
	}
	

	public static void main(String[] args) {
		Cow c=new Cow();
		System.out.println(c.type);
		c.eat();
		c.use();
		System.out.println(c.food);
	}

}
