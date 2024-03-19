package nonstaticmembers;

public class NSM_method {
	
	public void play()
	{
		System.out.println("PEN FIGHT");
	}

	public void write()
	{
		System.out.println("Good hand writing");
	play();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NSM_method p=new NSM_method();
p.write();
	}

}
