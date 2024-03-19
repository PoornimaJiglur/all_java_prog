package practiceallloop;

public class P3_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 char ch = 'a';
		 int ascii = ch;
		do
		{
			System.out.println("The ASCII value of " + ch
                    + " is: " + ascii);
			ascii++;
			ch++;
		}
		while(ascii<='z');
	}

}
