package interface_1;

public class Book implements Novel,Comic {

	public void read()
	{
		System.out.println("Amazing book");
	}
	public static void main(String[] args) {
		
		Novel n=new Book();
		n.read();
		Comic c=new Book();
		c.read();

	}

}
