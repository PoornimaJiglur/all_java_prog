package number;

public class TwistedPrimeNumber {

	public static void main(String[] args) {
		int i=1;
		int n=17;
		int count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
				
			}
			
i++;
			
		}
		//System.out.println(count);
	if(count==2)
	{
		System.out.println("Prime Number : " + n);
		int rev=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
		    System.out.println(rev);
		    n++;
			n=n/10;
		}
		if(rev==n)
		{
			System.out.println("twisted prime : " + n);
		}
		
	}
	else
	{
		System.out.println("The number is not Prime Number : " + n);
	}
		
		
		
		
	}

}
