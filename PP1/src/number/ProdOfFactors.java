package number;

public class ProdOfFactors {

	public static void main(String[] args) {
		int n=6;
		int i=1;
		int prod=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println("divisible successfully : " + i);
				prod=prod*i;
				
			}
			
			i++;
			
			
		}
		System.out.println("Sum of factors : " + prod);
	}
	}


