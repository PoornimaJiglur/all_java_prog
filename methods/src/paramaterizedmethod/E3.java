package paramaterizedmethod;

public class E3 {
	
	public static void check(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          check(6);
          check(36);
          check(9);
          check(0);
          check(-6);
	}

}
