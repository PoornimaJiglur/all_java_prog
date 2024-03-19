package number;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0, n2=1;
		System.out.println(n1);
		System.out.println(n2);
		int temp=0,n=20;
		
		
		
		for(int i=1;i<=n;i++)
		{
			i++;
			n2++;
			temp=temp+n2;
			System.out.println(temp);
		}
		
	}

}
