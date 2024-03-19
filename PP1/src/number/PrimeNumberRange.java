package number;

public class PrimeNumberRange {

	public static void main(String[] args) {

	int n=1;
	
		for(n=1;n<=20;n++) //to find out range
		{
			int count=0;
		for(int i=1;i<=n;i++) //to find out prime number
		
		{
			if(n%i==0)
			{
				count++;
				
			}
			
		}
   
		
		if(count==2)
	{
		System.out.println("Prime Number : " + n);
	}
	}
		
	}
}


