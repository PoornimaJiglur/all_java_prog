package arrays;

public class SplitWords {

	public static void main(String[] args) {
		/*String s="Java is a programming Language";
		String words[]=s.split(" ");// splitting words by space
		System.out.println(words);
		for(int i=0;i<=words.length-1;i++)
		{
			System.out.println(words[i]);
		}*/

		String s1="Java is a programming Language";
		String words1[]=s1.split("a");// splitting words by 'a' character
		System.out.println(words1);
		for(int i1=0;i1<=words1.length-1;i1++)
		{
			System.out.println(words1[i1]);
		}

	
	}

}
