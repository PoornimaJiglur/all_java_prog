package abstraction;

public class SnapChat extends SocialMedia{
	
	public void login()
	{
		System.out.println("Login Successful");
	}
	public void removeFriends()
	{
		System.out.println("Friend is Removed");
	}
	public void addFriends()
	{
		System.out.println("Friend added");
	}


	public static void main(String[] args) {
		SocialMedia s=new SnapChat();
		s.login();
		s.removeFriends();
		s.addFriends();

	}

}
