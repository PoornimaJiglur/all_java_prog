package encapsulation;

public class AccountDriver {

	public static void main(String[] args) {
	Account a=new Account();
	// directly data can not be called in another class so using getter method indirectly we are calling data
	//System.out.println(a.bal); 
	System.out.println(a.getBal());
	//Setter method is using here to update the data
	
	a.setBal(5000);
	System.out.println(a.getBal());

	}

}
