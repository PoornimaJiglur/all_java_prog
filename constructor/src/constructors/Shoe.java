package constructors;

public class Shoe {
	
	String Brand;
	String shoetype;
	
	Shoe()
	{
		System.out.println("I Love Shoes");
	}
	

	public static void main(String[] args) {
	
		Shoe s=new Shoe();
		s.Brand="Bata";
		s.shoetype="leather";
		System.out.println(s.Brand);
		System.out.println(s.shoetype);
		Shoe s1=new Shoe();
		s1.Brand="Bata";
		s1.shoetype="leather";
		System.out.println(s1.Brand);
		System.out.println(s1.shoetype);
	}

}
