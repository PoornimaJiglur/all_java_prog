package mypracticeprogram;

import java.util.Scanner;

public class Question5factorial {

	public static void main(String[] args) {
		
		int i=1,fact=1;
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(i<=n)
		{
			fact=fact*i;
			i++;
			
		}
		
		System.out.println("Factorial of number " + n + " : "+ fact);
		

	}

}
