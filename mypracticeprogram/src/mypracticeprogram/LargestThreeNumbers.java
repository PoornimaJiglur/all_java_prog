package mypracticeprogram;

public class LargestThreeNumbers {

	public static void main(String[] args) {
		int a=60,b=50,c=40;
		
		if(a>b && b>c)
		{
			System.out.println(a + " : is largest number");
		}
		else if(b>c)
		{
			System.out.println(b + " : is largest number");
		}	
		else 
		{
			System.out.println(c + " : is largest number");
		}
	}

}
