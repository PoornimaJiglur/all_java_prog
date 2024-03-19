package mypracticeprogram;

public class LeapYear {

	public static void main(String[] args) {
	
	int n=2024;
	
	
	if (n % 4 == 0&&n%100 != 0||n%400 == 0) 
	{
		System.out.println("The year is leap year : " + n);
	}
	else 
	{
		System.out.println("The year is not leap year : " + n);
	}	
	}

}
