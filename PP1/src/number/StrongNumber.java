package number;

public class StrongNumber {

	public static void main(String[] args) {
	

			int n=2;
			int i=1;
			int sum=0;
			int temp=0;
			temp=n;
			while(n>0)
			{
				int rem=n%10;
				int fact=1;

			for(i=1;i<=rem;i++)
				
			{
		
				fact=fact*i;
				
				
			}
					System.out.println(rem + "->" + fact);
			n=n/10;
			sum=sum+fact;
			
		}
			System.out.println("Sum of each fact digit : " + sum);
		if(sum==temp)
		{
			System.out.println("The given number is strong number : " + temp);
		}
		else
		{
			System.out.println("The given number is not strong number : " + temp);
		}
			
	}

}
