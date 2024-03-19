package abstraction;

public class Samsung extends Mobile{
	
	public void call()
	{
	System.out.println("Calling...");	
	}
	public void message()
	{
		System.out.println("Message send successfully...");	
	}
	public void internet()
	{
		System.out.println("No Internet");	
	}
	public  void camera()
	{
		System.out.println("Good camera Clarity");	
	}
	
	
	
	public static void main(String[] args) {
		
		Mobile m=new Samsung();
		m.call();
		m.message();
		m.internet();
		m.camera();
		

	}

}
