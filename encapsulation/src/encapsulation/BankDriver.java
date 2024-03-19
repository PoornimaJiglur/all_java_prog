package encapsulation;

public class BankDriver {

	public static void main(String[] args) {
		
		Bank b=new Bank(1234567, "Poornima","ICIC34234","MG Road", 243423423, "rem:2423422");
		System.out.println(b.getAccno());
		System.out.println(b.getAccountHolderName());
		System.out.println(b.getbal());
		b.setPhoneno(98765431);
		System.out.println(b.getPhoneno());
		
	}

}
