package number;

public class SpyNumber {

	public static void main(String[] args) {
		// given number is spy number or not
		int n=1234;
		int rem=0;
		int sum=0;
		int prod=1;
		
		while(n>0)
		{
			rem=n%10;
			System.out.println(rem);
			sum=sum+rem;
			prod=prod+rem;
			n=n/10;
			
		}
		System.out.println(sum);
		System.out.println(prod);
		if(sum==prod)
		{
			System.out.println("given number is Spy number");
		}
		else
		{
			System.out.println("given number is not Spy number");			
		}
	}

}
