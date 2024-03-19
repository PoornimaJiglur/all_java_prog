package ifdms;

public class P7 {

	public static void main(String[] args) {
		{
			char c='5';
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println(c+" is vowel");
			}
			else if(c>='0'&&c<='9')
			{
				System.out.println(c+" is number");
				
			}
			else
			{
				System.out.println(c+" consonant");
			}
		}

	}

}
