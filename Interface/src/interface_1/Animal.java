package interface_1;

public class Animal implements Wild,Domestic{
	
	public void sound()
	{
		System.out.println("Scary sound");
	}

	public static void main(String[] args) {
		Wild w=new Animal();
		w.sound();
		Domestic d=new Animal();
		d.sound();

	}

}
