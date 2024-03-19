package inheritance_package;

public class Hindi extends Language{
	public void write()
	{
		System.out.println("Neat");
	}
	public void speak()
	{
		System.out.println("fluent");
	}

	public static void main(String[] args) {
		Hindi h=new Hindi();
		System.out.println("h.countryname");
		French f=new French();
		f.learn();
		f.read();
		System.out.println("h.statename");
		h.write();
		h.speak();
		
		

	}

}
