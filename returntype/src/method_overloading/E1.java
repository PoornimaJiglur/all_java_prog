package method_overloading;

public class E1 {
	
	public class Method_overloading {
		
		public static void add(int a, int b)
		{
			System.out.println(a+b);
		}
		public static void add(int a, int b, int c)
		{
			System.out.println(a+b);
		}
		public static void add(double a, double b)
		{
			System.out.println(a+b);
		}
		public static void add(int a, double b)
		{
			System.out.println(a+b);
		}
		public static void add(double a, int b)
		{
			System.out.println(a+b);
		}
		
		
		

		public static void main(String[] args) {
			
	add(10,20,30);
	add(10.1,2.5);
	add(10,5.5);
	add(5,4,1);
		}

	}


}
