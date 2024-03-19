package assignment_onlinePart2;

public class Account1 extends Account {
	
	String ifsc;
	
	
	public Account1(long acno, double bal, String accname, String ifsc) {
		super(acno, bal, accname);
		this.ifsc = ifsc;
	}

	public void fixedDeposit()
	{
		System.out.println("Fixed Deposit amount");
	}

	public static void main(String[] args) {
	Account1 a=new Account1(12345678,50000,"Poornima","ICICI01");
	a.deposit();
	a.withdraw();
	System.out.println(a.acno);
	
	System.out.println(a.bal);
	System.out.println(a.accname);
	System.out.println(a.ifsc);
	
	
	
	}

}
