package practiceallloop;

public class P2_dowhile {

	public static void main(String[] args) {
	
		int i=2;
		int sum=0;
		int add=sum;
		do
		{
			
			if(i%2==0)
			{

				
				sum=sum+i;
				add=add+sum;
				System.out.println(add);
				i++;
				
			}
			
			
		}
		while(i<=10);
	}


}
