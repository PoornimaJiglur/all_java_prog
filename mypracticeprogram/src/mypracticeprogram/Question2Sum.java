package mypracticeprogram;

import java.util.Scanner;

public class Question2Sum {

	public static void main(String[] args) {
	
		int sum=0;
		int i=0;
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
					
		while(i<=n)
		{
			if(i%2==0)
			{
				
				System.out.println(i);
				sum=sum+i;
			}
			i++;	
		}
		System.out.println("Sum of even numbers : " + sum);
	}

}
