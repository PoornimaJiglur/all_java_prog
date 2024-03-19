package constructors;

public class Pet {
	
	String color;
	String petname;
	int age;
	
	public Pet(String color, String petname, int age)
	{
		this.color=color;
		this.petname=petname;
		this.age=age;
	}

	public static void main(String[] args) {
		
		Pet p=new Pet("Black","bulldog",5);
		System.out.println(p.color);
		System.out.println(p.petname);
		System.out.println(p.age);

	}

}
