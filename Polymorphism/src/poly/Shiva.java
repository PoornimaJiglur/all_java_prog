package poly;

public class Shiva extends God{
	public static void pray()
	{
		System.out.println("Shiva Blessed");
	}


	public static void main(String[] args) {
		God g=new Shiva();
		g.pray();

	}

}
