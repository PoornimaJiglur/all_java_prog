package logicalNot;

public class E1 {

	public static void main(String[] args) {
		{
			int num1=100;
			int num2=50;
			boolean r=num1>num2||num1!=num2;
			System.out.println(r);
			System.out.println(!r);
			System.out.println(!true);
			System.out.println(!false);
		}

	}

}
