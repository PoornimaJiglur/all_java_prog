package nsv;

public class IPL {
	
	
	
	int team;
	String captain;
	String owner;
	
	
	

	public static void main(String[] args) {
		
		IPL I=new IPL();
		I.team=11;
		I.captain="Dhoni";
		I.owner="Kingfisher";
		System.out.println(I.team);
		System.out.println(I.captain);
		System.out.println(I.owner);
		
		IPL I1=new IPL();
		I1.team=12;
		I1.captain="Virat";
		I1.owner="SAHARA";
		System.out.println(I1.team);
		System.out.println(I1.captain);
		System.out.println(I1.owner);

	}

}
