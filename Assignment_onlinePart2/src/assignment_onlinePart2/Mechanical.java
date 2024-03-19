package assignment_onlinePart2;


public class Mechanical extends Department{
	
	public void enrollCourse()
	{
		System.out.println("CSE");
	}
	public void feePayment()
	{
		System.out.println("100000");
	}
	public void fest()
	{
		System.out.println("Annual Fest");
	}
	

	public static void main(String[] args) {
		Department d=new Mechanical();
		
	d.enrollCourse();
	d.feePayment();
	d.fest();

	}

}