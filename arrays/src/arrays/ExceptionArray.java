package arrays;

import java.util.Scanner;

public class ExceptionArray {

	public static void main(String[] args) {
		// Creating an array
		
				Scanner sc=new Scanner(System.in);// reading user input
				System.out.println("Enter the size of an Array");
				
				int size=sc.nextInt();
				int rno[]=new int[size]; // array declaration
		// Storing value in an array
				rno[0]=101;
				rno[2]=102;
				rno[4]=105;
				System.out.println(rno[-1]);//AIOBE
				System.out.println(rno[6]);//AIOBE
				

	}

}
