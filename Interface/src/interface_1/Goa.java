package interface_1;

public class Goa implements TouristPlace{
	
	public void beach()
	{
		System.out.println("OM Beach");
	}
	public void food()
	{
		System.out.println("Sea Food");
		
	}

	public static void main(String[] args) {
		
		TouristPlace t=new Goa();
		t.beach();
		t.food();
	}

}
