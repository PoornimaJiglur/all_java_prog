package number;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=8;
		int i=1;
		int sum=0;
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.println("divisible successfully : " + i);
				sum=sum+i;
								
			}
			
			i++;
			
		}
		if(sum==n)
		{
			System.out.println("Perfect number : " + n);
			
		}
		else
			System.out.println("Not a perfect number : " + n);
	
	}

}
