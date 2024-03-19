package paramaterizedmethod;

public class P5 {

	public static void marks(int a, int b, int c, int d, int e)
	{
		double sum=(a+b+c+d+e);
		System.out.println("Total Marks " + sum);
		System.out.println("Total Marks " + ((sum)/500)*100);
		System.out.println("Total Marks " + (sum)/5);
	}
	public static void main(String[] args) {
	
		
		marks(50,65,45,57,85);
	}

}
