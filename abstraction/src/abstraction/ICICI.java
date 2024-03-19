package abstraction;

public class ICICI extends ATM{
	
	public  void withdraw()
	{
		System.out.println("WITHDRAW Button");
	}
	public  void checkbal()
	{
		System.out.println("Check Balance Button");
	}
	public  void deposits()
	{
		System.out.println("Deposit Button");
	}

	public  void generateOTP()
	{
		System.out.println("Generate OTP Button");
	}

	
	public static void main(String[] args) {
		ATM a=new ICICI();
		a.withdraw();
		a.checkbal();
		a.deposits();
		a.generateOTP();
	

	}

}
