package pp1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// calculator using switch
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Addition");
		System.out.println("1)Substraction");
		System.out.println("1)Multiplication");
		System.out.println("1)Division");
		System.out.println("--------------------");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.println("Enter 2 values");
int a=sc.nextInt();
int b=sc.nextInt();

		
		
		switch(choice)
		{
		case 1: System.out.println("Addition : " + (a + b));
		break;
		case 2: System.out.println("Substraction : " + (a-b));
		break;
		case 3: System.out.println("Multiplication : "  + (a * b));
		break;
		case 4: System.out.println("Division : "  + (a / b));
		break;
		default: System.out.println("Invalid choice");
		}
		

	}

}
