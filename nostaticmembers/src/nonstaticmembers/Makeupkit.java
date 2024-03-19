package nonstaticmembers;

public class Makeupkit {
	
	String lipstick;
	String foundation;
	String cream;
	String Kajal;
	

	public static void main(String[] args) {

		Makeupkit m=new Makeupkit();
		m.lipstick="Red";
		m.foundation="light Shade";
		m.cream="Lakme";
		m.Kajal="Himalaya";
		
		System.out.println(m.lipstick);
		System.out.println(m.foundation);
		System.out.println(m.cream);
		System.out.println(m.Kajal);
		
		System.out.println("=======================================");
		
		Makeupkit m1=new Makeupkit();
		m1.lipstick="Pink";
		m1.foundation="Dark Shade";
		m1.cream="Mayblin";
		m1.Kajal="Elle";
		
		System.out.println(m1.lipstick);
		System.out.println(m1.foundation);
		System.out.println(m1.cream);
		System.out.println(m1.Kajal);

	}

}
