package nsm;
import java.util.*;

public class Rectangle {
	
	
		int length;
		int breadth;
		
	
	
	public void rectanglearea(int l, int b)
	{
		length=l;
		breadth=b;
	}
	public void calcarea()
	{
		int res=length*breadth;
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of area");
		Rectangle R=new Rectangle();
		R.length= sc.nextInt();
		System.out.println("Enter Breadth of area");
		R.breadth=sc.nextInt();
		R.calcarea();
		
		
		
		
	}

}
