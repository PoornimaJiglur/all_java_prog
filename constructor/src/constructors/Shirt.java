package constructors;

public class Shirt {
	
	String type;
	String size;
	String quality;
	
	Shirt(String type,String size,String quality)
	{
		this.type=type;
		this.size=size;
		this.quality=quality;
	}
	

	public static void main(String[] args) {
		
		Shirt s=new Shirt("formal","XL","cotton");
		System.out.println(s.type);
		System.out.println(s.size);
		System.out.println(s.quality);
		
		Shirt s1=new Shirt("casual","L","Nylon");
		System.out.println(s1.type);
		System.out.println(s1.size);
		System.out.println(s1.quality);
		
		Shirt s2=new Shirt("Tshirt","M","Spun");
		System.out.println(s2.type);
		System.out.println(s2.size);
		System.out.println(s2.quality);
	}

}
