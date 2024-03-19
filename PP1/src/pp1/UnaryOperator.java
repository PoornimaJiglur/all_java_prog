package pp1;

public class UnaryOperator {

	public static void main(String[] args) {
	int x=-2;
	int y=x++ + ++x - x-- * --x + x++;
	System.out.println(x);
	System.out.println(y);
	System.out.println("hello"+'a'+10);
	
	}

}
