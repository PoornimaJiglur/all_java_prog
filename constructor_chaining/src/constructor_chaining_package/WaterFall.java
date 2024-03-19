package constructor_chaining_package;

import constructors.ConstructorOverloading_WaterFall;

public class WaterFall {

	String name;
	String location;
	String depth;
	String tributaries;
	
	WaterFall(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	WaterFall(String name,String location,String depth)
	{
		this(name,location);
		this.depth=depth;
	}
	
	
	WaterFall(String name,String location,String depth,String tributaries)
	{
		this(name,location,depth);
		this.depth=depth;
		this.tributaries=tributaries;
	}

	public static void main(String[] args) {
	
		WaterFall WF=new WaterFall("Jog","Shimoga","3000meters");
		System.out.println(WF.name);
		System.out.println(WF.location);
		System.out.println(WF.depth);

	}

}
