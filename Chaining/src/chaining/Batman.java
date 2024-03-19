package chaining;

public class Batman extends SuperHero {
	int age=55;//NSV
	public void display()
	{
		int age=100;//local
				System.out.println(age);//100
		
				System.out.println(this.age);//55
				System.out.println(super.age);//50
		
	}
	public static void main(String [] args)
	{
		Batman b=new Batman();
		b.display();
	}

}
