package pp1;

public class UpperLowerCase {

	public static void main(String[] args) {
		char c='a';
		if (c>='a' && c<='z')
		{
			System.out.println("Entered char is lower case");
		}
		else if(c>='A' && c<='Z')
		{
			System.out.println("Entered char is Upper case");
		}
		else if(c>='0' && c<='9')
		{
			System.out.println("Entered char is Number");
		}
		else
			
			{
				System.out.println("Entered char is Special Char");
			}
	}

}
