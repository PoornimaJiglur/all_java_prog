package arrays;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// Creating an array
		
		Scanner sc=new Scanner(System.in);// reading user input
		System.out.println("Enter the size of an Array");
		
		int size=sc.nextInt();
		int rno[]=new int[size]; // array declaration
		System.out.println("Length of an Arrays is : " + rno.length);// printing length of an array

	}

}
