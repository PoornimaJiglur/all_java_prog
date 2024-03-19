package ifdms;

public class E8 {

	public static void main(String[] args) {
		// char is alphebt, nym or special char
		{
			char c='!';
			
			if(c>='A'&&c<='Z'||c>='a'&& c<='z')
			{
				System.out.println(c+" is an alphabet");
				
			}
			else if(c>='0'&&c<='9')
			{
				System.out.println(c+" is a number");
				
			}
			else 
			{
				System.out.println(c+" is a special char");
			}
		}
	}
	

}
