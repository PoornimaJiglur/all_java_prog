package number;

public class NumberStartsWithEvenOdd {

	public static void main(String[] args) {
		int n=234;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
		}
		System.out.println("Remainder is " + rem);
if(rem%2==0)
{
	System.out.println("Number is even number");
}
else
{
	System.out.println("Number is not even number");
}
	
	}

}
