package interface_1;

public class HouseLoan implements Loan {
	
	public int interest()
	
	{
		return 15;
	}

	public static void main(String[] args) {
		Loan l=new HouseLoan();
		System.out.println(l.interest());

	}

}
