package poly;

public class Daughter extends Father{
	
	
	//method override in runtime polymorphism
	public void bike()
	{
		System.out.println("Hunter");
	}
	
	

	public static void main(String[] args) {
		Father f=new Daughter();
		f.bike();
		
	}

}
