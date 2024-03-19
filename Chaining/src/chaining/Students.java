package chaining;

public class Students extends Teacher {
	Students()
	{
		//super() compiler added
		System.out.println("Hi from students");
	}

	public static void main(String [] args)
	{
		Students s=new Students();
	}
}
