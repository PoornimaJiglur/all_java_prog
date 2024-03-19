package number;

public class EvenNumberRange {

	public static void main(String[] args) {
	
		int i=0;
		for(i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number range : " + i);
			}
			else
			{
				System.out.println(" Odd number range : " + i);
			}
		}
	}

}
