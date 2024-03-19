package number;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i=1;
		int n=23;
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
	}
	else
	{
		System.out.println("The number is not Prime Number : " + n);
	}
		
	
	}

	}

