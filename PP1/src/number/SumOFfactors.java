package number;

public class SumOFfactors {

	public static void main(String[] args) {
		int n=2;
		int i=1;
		int sum=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println("divisible successfully : " + i);
				sum=sum+i;
				
			}
			
			i++;
			
			
		}
		System.out.println("Sum of factors : " + sum);
	}

}
