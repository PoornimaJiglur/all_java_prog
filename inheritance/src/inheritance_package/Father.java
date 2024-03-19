package inheritance_package;

public class Father extends GrandFather {
	
	public void name()
	{
		System.out.println("Nagaraj");
	}

	public static void main(String[] args) {
		Father f=new Father();
		f.Surname();
		f.name();
		f.House();
	
	}

}
