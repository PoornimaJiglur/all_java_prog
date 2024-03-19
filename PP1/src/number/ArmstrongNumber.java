package number;

public class ArmstrongNumber {

	public static void main(String[] args) {
	// count the digit
		int n=153, n1=n, sum=0;
		int c=0,temp=n;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		//take count as exponent for each digit
	
	while(n1>0)
	{
		int rem=n1%10;
		int pow=1;
		//find power for each digit
		for(int i=1;i<=c;i++)
		{
			pow=pow*rem;
		}
		System.out.println(rem + "==>" + pow);
		sum=sum+pow;
		n1=n1/10;
		
	}
	if(sum==temp)
	{
		System.out.println("Armstrong Number");
		
	}
	else
	{
		System.out.println("Not an Armstrong Number");
	}
	
	}

}
