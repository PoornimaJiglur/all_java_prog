package p3;

public class P3_class {
	
	
	public static void add()
	{
		sub();
		System.out.println("Added");//5th
	}
	public static void sub()
	{
		System.out.println("Subtracted");//2nd	
		mul();
		System.out.println("Task done");//4th
		
	}
	public static void mul()
	{
	System.out.println("Multiplied");	//3rd
}



public static void main(String[] args) {
	System.out.println("Main begins");  //1st
	add();
	System.out.println("Main ends");	//6th

}

}