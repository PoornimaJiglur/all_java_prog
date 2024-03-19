package ifdms;

public class E10 {

	public static void main(String[] args) {
		// chck for army selection
		int age=20;
		int ht=6;
		if(age>18)
		{
			if(ht>5)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("not eligible for army");
			}
			
		}
		else
		{
			System.out.println("grow up kid");
		}
	}

}
