package nsm;

public class MakeMyTrip {
	
	String source;
	String destination;
	int distance;
	String date;
	
	public void tripdetails(String s, String d,int dist,String dt)
	{
		source=s;
		destination=d;
		distance=dist;
		date=dt;
		
	}
	
	public void display()
	{
		System.out.println(source);
		System.out.println(destination);
		System.out.println(distance);
		System.out.println(date);
		
	}

	public static void main(String[] args) {
	
		MakeMyTrip M=new MakeMyTrip();
		
		M.tripdetails("Blr","del", 4000, "23-4-2024");
		M.display();

	}

}
