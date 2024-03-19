package number;

public class PowerOfNumber {

	public static void main(String[] args) {
	int base=5, ex=2, pow=1;
	
	
	for(int i=1;i<=ex;i++)
	{
		pow=pow*base;
		
	}
	System.out.println("Power of number : " + base + " is "+ pow);
	}

}
