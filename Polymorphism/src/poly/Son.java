package poly;

public class Son extends Mother{
	
	//method override in runtime polymorphism
	
	public void marry()
	{
		System.out.println("Alia");
	}

	public static void main(String[] args) {
		Mother m=new Son();
		m.marry();

	}

}
