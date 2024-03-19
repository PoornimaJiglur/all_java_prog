package constructors;

public class Hat1 {
	//parameterized argument constructor
	int price; //NSV
	String brand;
public Hat1(int p,String b)
{
	price=p;
	brand=b;

}

	public static void main(String[] args) {
		

		Hat1 h=new Hat1(100, "puma");
		System.out.println("hi from main");
	}

}
