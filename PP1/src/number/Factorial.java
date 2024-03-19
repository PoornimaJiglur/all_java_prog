package number;

public class Factorial {

	public static void main(String[] args) {
		int fact=154;
		int n=3;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of number " + n + " : "+ fact);
		

	}

}
