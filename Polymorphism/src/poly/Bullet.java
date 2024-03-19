package poly;

public class Bullet extends Train{
	public static void destination()
	{
		System.out.println("Reached Fast");
	}

	public static void main(String[] args) {
		Train t=new Bullet();
		t.destination();

	}

}
