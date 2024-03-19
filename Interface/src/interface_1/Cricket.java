package interface_1;

public class Cricket implements Sports{
	
	public void play()
	{
		System.out.println("Play Happily");
	}
	public void watch()
	{
		System.out.println("Good to watch");
	}
	public void reward()
	{
		System.out.println("World Cup");
	}

	public static void main(String[] args) {
		Sports s=new Cricket();
		s.play();
		s.watch();
		s.reward();

	}

}
