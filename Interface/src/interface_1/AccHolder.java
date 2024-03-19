package interface_1;

public class AccHolder implements SBI{
	
	public void deposit() 
	{
		System.out.println("Amount Deposited");
	}
	public void withdraw()
	{
		System.out.println("Amount withdraw");
	}
	public static void main(String[] args) {
		
	SBI a=new AccHolder();
	
	a.deposit();
	a.withdraw();
	
	ReservedBank r=new AccHolder();
	r.deposit();
	
	
	}

}
