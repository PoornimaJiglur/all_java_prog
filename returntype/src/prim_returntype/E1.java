package prim_returntype;

public class E1 {

	public static int Add(int a, int b)
	{
		//return a+b; expression using return
		int r=a+b;
		return r  ;  // using variable in return
		
		
	}
	public static void main(String[] args)
	{
		// Add(4, 5); returned value is not utilized
		System.out.println(Add(4, 5));
		
		int res=Add(4,5);
		System.out.println(res);
	}
}
