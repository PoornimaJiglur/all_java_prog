package prim_returntype;

public class P1 {

	public static int great(int a, int b)
	{
		
		if (a>b)
			return a;
		else
			return b;
	}
	public static void main(String[] args) {
		
		
	System.out.println(great(4,5));
	System.out.println(great(14,5));

	}

}
