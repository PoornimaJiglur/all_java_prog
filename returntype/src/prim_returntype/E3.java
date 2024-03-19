package prim_returntype;

public class E3 {

	public static String check(int num)
	{
		if(num%2==0)
			return "Even";
		else
			return "odd";
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(check(5));
		System.out.println(check(4));
	}

}
