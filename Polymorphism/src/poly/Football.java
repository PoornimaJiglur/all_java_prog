package poly;

public class Football extends Sports {
	public static void play()
	{
		System.out.println("Game Lost");
	}
	

	public static void main(String[] args) {
		
Sports s=new Football();
   s.play();
	}

}
