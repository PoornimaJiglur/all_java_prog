package nonprim_TypeCasting;

public class Airtel extends ServiceProvider{
	
String CEO;
int noofusers;
int simno;
int phoneno;



	public Airtel(String locations, String services, String ratings, String CEO, int noofusers, int simno, int phoneno) {
	super(locations, services, ratings);
	this.CEO = CEO;
	this.noofusers = noofusers;
	this.simno = simno;
	this.phoneno = phoneno;
}



	public static void main(String[] args) {
		
	ServiceProvider SP=new Airtel("Blr","internet","5 star","Mittl",10000,1234567,9876543);
	Airtel A=(Airtel)SP;
	System.out.println(A.locations);
	System.out.println(A.services);
	System.out.println(A.ratings);
	System.out.println(A.CEO);
	System.out.println(A.noofusers);
	System.out.println(A.simno);
	System.out.println(A.phoneno);
	

	}

}
