package interface_1;

public class IBM implements Company {
	
	public void employeeDetails()
	{
		System.out.println("Poornima-E0470");
	}
	public void careers()
	{
		System.out.println("Hiring on QA");
	}
	public void product()
	{
		System.out.println("Travel Domain");
	}
	public void career()
	{
		System.out.println("QA");
	}
	public void aboutCompany()
	{
		System.out.println("FinTech");
	}

	

	public static void main(String[] args) {
		Company c=new IBM();
		c.employeeDetails();
		c.careers();
		c.product();
		c.aboutCompany();

	}

}
