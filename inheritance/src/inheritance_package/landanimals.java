package inheritance_package;

public class landanimals extends Animals {
	
	String name="lizard";
	public void land()
	{
		System.out.println("lizard live on land");
		
	}
	public static void main(String[]args)
	{
		landanimals l=new landanimals();
		l.land();
		System.out.println(l.name);
		l.livein();
		amphibians a=new amphibians();
		a.category();
		System.out.println(a.name);
		
	}

}
