package number;

public class Swappingof2values {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp=0;
		
		System.out.println("Before Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		do
		{
			
			temp=temp+a;
			
			a=b;
			b=temp;
			
			System.out.println("---------------");
				
			System.out.println("After Swap");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			
			
		}
		while(temp<10);
		

	}

}
