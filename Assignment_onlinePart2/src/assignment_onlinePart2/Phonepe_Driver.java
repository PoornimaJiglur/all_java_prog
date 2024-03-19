package assignment_onlinePart2;

public class Phonepe_Driver {

	public static void main(String[] args) {
	
		PhonepeService p=new PhonepeService(50000.5,1234);
		p.checkBal();
		p.changePin();
		p.transferMoney();
		

	}

}
