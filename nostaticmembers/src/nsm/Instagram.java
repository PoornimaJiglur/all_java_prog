package nsm;

public class Instagram {
	
	String id;
	String pwd;
	
	public void profile(String i, String p)
	{
		id=i;
		pwd=p;
		
	}
	public void login(String i, String p)
	
	{
		if(id==i && pwd==p)
		{
			System.out.println(id);
			System.out.println(pwd);
			System.out.println("Entered details are correct");
		}
		else
		{
			System.out.println("Entered details are not correct");
		}
		
		
	}
	

	public static void main(String[] args) {
	
		Instagram I=new Instagram();
		I.profile("re","450");
		I.login("po","450");
	}

}
