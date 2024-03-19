package inheritance_package;

public class Mango extends Tree
{
	//single level

	String season="summer";
	String name="raw";
	public void taste()
	{
		System.out.println("Sour and tasty");
		
	}
	public static void main(String[] args) {
		
		Mango m=new Mango();
		System.out.println(m.season);
		m.soil();
		System.out.println(m.type);
		System.out.println(m.name);
		
	}

}
