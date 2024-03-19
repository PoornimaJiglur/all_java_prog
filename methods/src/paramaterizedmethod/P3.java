package paramaterizedmethod;

public class P3 {

	public static void triangle(int a, int b, int c)
	{
		if(a==b&&b==c&&a==c)
			System.out.println("Equilateral triangel");
		else if(a==b||b==c||a==c||b==a)
			System.out.println("Isoceles triangle");
		else
			System.out.println("Scalene Triangle");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle(4,4,4);
		triangle(4,3,5);
		triangle(6,6,8);
		triangle(2,5,2);
	}

}
