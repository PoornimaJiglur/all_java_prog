package assignment_onlinePart2;

public class PhonepeService implements PhonePe{

	double bal;
	int pin;
	
	public PhonepeService(double bal, int pin) {
		super();
		this.bal = bal;
		this.pin = pin;
	}
	public void checkBal()
	{
		System.out.println("Remainig Bal : "+bal);
	}
	public void transferMoney()
	{
		System.out.println("Transfered amount is : "+ (bal-10000));
	}
	public void changePin()
	{
		System.out.println("Pin Changed to : "+pin);
	}
	
	

}
