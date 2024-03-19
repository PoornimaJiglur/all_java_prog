package inheritance_package;

public class Car2 extends Car1{
	
	int cc=80;
	 public void playMusic()
	 {
		 System.out.println("Nice music system in Suzuki");
	 }

	public static void main(String[] args) {

		Car2 c=new Car2();
		System.out.println(c.brand);
		System.out.println(c.price);
		c.playMusic();
		System.out.println(c.cc);
		


	}

}
