package constructors;

public class pen {
	
	String color;
	String use;
	String thickness;
	
	public pen(String color)
	{
		this.color=color;
	}
	public pen(String color, String use)
	{
		this.color=color;
		this.use=use;
	}
	
	public pen(String color, String use,String thickness)
	{
		this.color=color;
		this.use=use;
		this.thickness=thickness;
	}
	
	

	public static void main(String[] args) {
		
		pen p=new pen("blue","write","thin");
		System.out.println(p.color);
		System.out.println(p.use);
		System.out.println(p.thickness);
		pen p1=new pen("blue","write");
		System.out.println(p1.color);
		System.out.println(p1.use);
		
		
	}

}
