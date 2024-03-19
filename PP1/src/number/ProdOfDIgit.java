package number;

public class ProdOfDIgit {

	public static void main(String[] args) {
		// product of digits
		int i=15282;
		int prod=1;
		
		while(i>0)
		{
			int rem=i%10;
			System.out.println(rem);
			prod=prod*rem;
			
			i=i/10;
			
		}
		System.out.println(prod);
		

	}

}
