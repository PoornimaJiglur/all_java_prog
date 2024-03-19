package static_initializer;

public class S2 {
	
	static int age=10;
	static
	{
		age=11;
	}
	

	public static void main(String[] args) {
		System.out.println(age);

	}

	static
	{
		age=25;
		
	}
	static
	{
		age=100;
	}
}
