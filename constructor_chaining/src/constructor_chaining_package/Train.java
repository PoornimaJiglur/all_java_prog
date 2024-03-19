package constructor_chaining_package;

public class Train {
	
	String name;
	String source;
	String destination;
	int distance;
	String type;
	Train(String name)
	{
		this.name=name;
	}
	Train(String name, String source)
	{
		this(name);
		this.source=source;
	}
	Train(String name, String source,String destination)
	{
	this(name,source);
	this.destination=destination;
	}
	Train(String name, String source,String destination, int distance)
	{
		this(name,source,destination);
		this.distance=distance;
	}
	Train(String name, String source,String destination, int distance,String type)
	{
		this(name,source,destination,distance);
		this.type=type;
	}
	

	public static void main(String[] args) {
	Train t=new Train("Mys Exp","BLR","BJP");

	System.out.println(t.name);
	System.out.println(t.source);
	System.out.println(t.destination);
	}

}
