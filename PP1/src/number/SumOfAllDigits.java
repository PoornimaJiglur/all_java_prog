package number;

public class SumOfAllDigits {

	public static void main(String[] args) {
		// Sum of all digits
		int i=56826;
		int sum=0;
		int rem=0;
		while(i>0) //C
		
		{
			rem=i%10;
			System.out.println(rem);
			sum=sum+rem;
			i=i/10; //u
			
		}
		System.out.println(sum);
		
	}

}
