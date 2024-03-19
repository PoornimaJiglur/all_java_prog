package abstraction;

public class SBI extends Bank {
	
	public int roi()
	{
		return 8;
	}

	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println(b.roi());
		

	}

}
