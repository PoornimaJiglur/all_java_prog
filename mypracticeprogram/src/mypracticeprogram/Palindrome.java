package mypracticeprogram;

public class Palindrome {

	public static void main(String[] args) {
	int n=5451;
	int temp=0, rem=0, rev=0;
	
	rev=n;
	while(n>0)
		
	{
		rem=n%10;
		temp=temp*10+rem;
			n=n/10;

	}
	if(temp==rev)
	{
		System.out.println("Number is palindrome : " + temp);
	}
	else
	{
		System.out.println("Number is not palindrome : " + temp);
	}
	
	}

}
