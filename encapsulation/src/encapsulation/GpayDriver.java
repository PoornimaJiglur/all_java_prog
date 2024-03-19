package encapsulation;

public class GpayDriver {

	public static void main(String[] args) {
		
		Gpay G=new Gpay("24324932", 34234232, "poornima", 64565745, 3456, 6474, "ICICI4534",
				"Paid:43242");
		System.out.println(G.getName());
		System.out.println(G.getCard());
		System.out.println(G.getMob());
		G.setPin(3422);
		System.out.println(G.getPin());
		
	}

}
