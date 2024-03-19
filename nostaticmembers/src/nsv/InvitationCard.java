package nsv;

public class InvitationCard {
	
	String brideName;
	String GroomName;
	String date;
	String location;
	
	public static void main(String[] args) {
		InvitationCard I = new InvitationCard();
		I.brideName="Poornima";
		I.GroomName="Nagaraj";
		I.date="21-12-2012";
		I.location="Hubli";
		System.out.println(I.brideName);
		System.out.println(I.GroomName);
		System.out.println(I.date);
		System.out.println(I.location);
		

	}

}
