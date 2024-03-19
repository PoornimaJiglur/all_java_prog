package number;

public class CountNumberOfDigit {

	public static void main(String[] args) {
	int n=52133,c=0;
	
	while(n>0)
	{
	
		n=n/10;
		c++;
	}
System.out.println(c);
	}

}
