package assignment_onlinePart2;

public class Matrimony_driver {

	public static void main(String[] args) {
		
		Matrimony m=new Matrimony("Poornima",30,"Female");
		System.out.println(m.getgender());
		Matrimony m1=new Matrimony("Aarush",30,"Female");
		System.out.println(m1.getgender());
		if(m.getgender()==m1.getgender()&&m.getAge()==m1.getAge())
		{
			System.out.println("Genders are equal");
		}
		else
		{
			System.out.println("Ages are equal");
		}
			
		if(m.getgender()==m1.getgender()&&m.getAge()==m1.getAge())
		{
			System.out.println("You found your Match");
		}
	}

}
