package assignment_onlinePart2;

public class Instagram {
	private String userName;
	private String pwd;
    private	String email;
	public Instagram(String userName, String pwd, String email) {
	
		this.userName = userName;
		this.pwd = pwd;
		this.email = email;
	}
	
	public String getUserName()
	{
		return userName;
	}
	public String getPwd()
	{
		return pwd;
	}
	public String getEmail()
	{
		return email;
	}
}
