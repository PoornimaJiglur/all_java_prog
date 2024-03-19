package practice_package;

import java.util.Scanner;

public class greaterofnumbers {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	        System.out.println("Enter first number");
	        int a=sc.nextInt();
			
	        System.out.println("Enter second number");
	        int b=sc.nextInt();
	        
	        if(a>b)
	        {
	            int c=a-b;
	            System.out.println(c);
	        }
	        else
	        {
	           int c=b-a;
	             System.out.println(c);
	        }

	}

}
