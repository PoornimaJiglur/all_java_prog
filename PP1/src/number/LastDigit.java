package number;

public class LastDigit {
	// last one digit then mod by 10, if 2 digit then mod by 100

	public static void main(String[] args) {
		int n=9276;
		
		int res=n%10;
		System.out.println("Last digit : " + res);
	// remove last digit,
		int res1=n/10;
		System.out.println("Last digit : " + res1);
	
	}

}
