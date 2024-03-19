package mypracticeprogram;

import java.util.Scanner;

public class QuestionLCM {

	public static void main(String[] args) {
		
		int gcd = 1;
		System.out.println("Enter first number");
		Scanner sc1=new Scanner(System.in);
		int n1=sc1.nextInt();
		System.out.println("Enter second number");
		Scanner sc2=new Scanner(System.in);
		int n2=sc2.nextInt();

	    for(int i = 1; i <= n1 && i <= n2; ++i) {
	      
	      if(n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }
	System.out.println("GCD of " + n1 + " and " + n2 + " is : " + gcd);
	 
	int lcm = (n1 * n2) / gcd;
	    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);

	}

}
