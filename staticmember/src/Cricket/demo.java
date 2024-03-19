package Cricket;

public class demo {
	
	static int a=100; //global //65

	public static void main(String[] args) {
		a=65;
		System.out.println(a); //65
		int a=33; //reintialise with 55
		a=55;
		System.out.println(demo.a); //65
		System.out.println(a); //55
		
	}

}
