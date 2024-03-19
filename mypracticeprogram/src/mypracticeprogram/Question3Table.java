package mypracticeprogram;

import java.util.Scanner;

public class Question3Table {

	public static void main(String[] args) {
		
		int i=0;
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(i<=10)
		{
			System.out.println(n + "*" + i +"=" + n * i);
			i++;
		}

	}

}
