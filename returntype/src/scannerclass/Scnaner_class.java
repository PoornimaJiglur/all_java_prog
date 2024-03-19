package scannerclass;
import java.util.Scanner;


public class Scnaner_class {

	public static void main(String[] args) {
		// create object for scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		
		
		System.out.println("Enter float number");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		System.out.println(f1+f2);
		
		
		System.out.println("Enter character"); 
		char c=sc.next().charAt(0);
		
		System.out.println(c);
		
		
		System.out.println("ENter a word");
		String word=sc.next();
		System.out.println(word);
		
		System.out.println("Enter quote");
		String quote=sc.nextLine();
		System.out.println(quote);
		
		
	}
}
