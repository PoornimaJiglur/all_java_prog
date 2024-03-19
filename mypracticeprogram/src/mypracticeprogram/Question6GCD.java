package mypracticeprogram;

import java.util.Scanner;

public class Question6GCD {

	public static void main(String[] args) {
	
	System.out.println("Enter first number");
	Scanner sc1=new Scanner(System.in);
	int n1=sc1.nextInt();
	System.out.println("Enter second number");
	Scanner sc2=new Scanner(System.in);
	int n2=sc2.nextInt();
	int gcd=1;
	for(int i=1;i<=n1 && i<=n2;++i)
	{
		if(n1%i==0 && n2%i==0)
	    		gcd=i;
	
	}
	System.out.println("GCD of " + n1 + " and " + n2 + " is : " + gcd );
	}

}
