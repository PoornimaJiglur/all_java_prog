package number;

public class ASCIIValue {

	public static void main(String[] args) {
		char c='A';
		int n=(int)c;
		while(n>='A' && n<='Z')
		{
		System.out.println("Char " +c+" ASCII Value is :" + n);
		n++;
		c++;
		}

	}

}
