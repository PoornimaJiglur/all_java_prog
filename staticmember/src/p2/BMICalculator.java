package p2;

import java.util.Scanner;

public class BMICalculator {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight ");
		float wt=sc.nextFloat();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter height ");
		float ht=sc.nextFloat();
		
		float result=BMI.calcbmi(wt,ht);
		
		
		if (result<18.5)
		
			System.out.println("Under weight");
		
		else if(result>=18.5 && result<24.5)
			
			System.out.println("Normal");
		else
			System.out.println("Over weight");
			

	}
}
