package assignment_onlinePart2;

public class Account {
	long acno;
	double bal;
	String accname;
	
	
	public Account(long acno, double bal, String accname) {

		this.acno = acno;
		this.bal = bal;
		this.accname = accname;
	}
	public double deposit()
	{
		System.out.println("Balance amount : "+bal);
		return bal;
	}
	public double withdraw()
	{
		System.out.println("Balance amount : "+bal);
		return bal;
	}

}
