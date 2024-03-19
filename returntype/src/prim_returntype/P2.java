package prim_returntype;

public class P2 {
	
	public static String positiveNegative(int a, int b)
	{
		if(a>b)
			return "Positive";
		else
			return "Negative";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(positiveNegative(-4,5));
		System.out.println(positiveNegative(14,-5));

	}

}
