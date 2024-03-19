package ifdms;

public class E9 {

	public static void main(String[] args) {
		// nested if ex: blood donation eligible
		int age=12;
		int wt=55;
		if(age>18)
		{
			if(wt>55)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("not eligible eat properly");
			}
			
		}
		else
		{
			System.out.println("grow up kid");
		}
	}

}
