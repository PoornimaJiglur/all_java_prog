package assignment_onlinePart2;

public class SnapChat extends SocialMedia{
	
	public void login()
	{
		System.out.println("Logged in Successfully");
	}
	
	public void removeFriends()
	{
		System.out.println("Friend Removed");
	}
	public void addFriends()
	{
		System.out.println("Friend Added");
	}
public static void main(String[] args)
{
	SnapChat s=new SnapChat();
	s.login();
	s.removeFriends();
	s.addFriends();
}
}
