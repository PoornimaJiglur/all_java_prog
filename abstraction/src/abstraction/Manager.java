package abstraction;

public class Manager extends Person{
	
	public void sal()
	{
		System.out.println("10 CTC");
	}

	public static void main(String[] args) {
		Person p=new Manager();
		p.sal();

	}

}
