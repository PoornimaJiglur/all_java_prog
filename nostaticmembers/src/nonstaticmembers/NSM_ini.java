package nonstaticmembers;

public class NSM_ini {
	
	int level=1;
	{
		int level=2;
	}

	public static void main(String[] args) {
		NSM_ini g=new NSM_ini();
		System.out.println(g.level);

	}
	{
		level=5;
	}

}
