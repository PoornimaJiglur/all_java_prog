package constructors;

public class ConstructorOverloading_WaterFall {
	
	String name;
	String location;
	String depth;
	String tributaries;
	
	ConstructorOverloading_WaterFall(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	ConstructorOverloading_WaterFall(String name,String location,String depth)
	{
		this.name=name;
		this.location=location;
		this.depth=depth;
	}
	
	
	ConstructorOverloading_WaterFall(String name,String location,String depth,String tributaries)
	{
		this.name=name;
		this.location=location;
		this.depth=depth;
		this.tributaries=tributaries;
	}

	public static void main(String[] args) {
	
		ConstructorOverloading_WaterFall WF=new ConstructorOverloading_WaterFall("Jog","Shimoga","3000meters");
		System.out.println(WF.name);
		System.out.println(WF.location);
		System.out.println(WF.depth);

	}

}
