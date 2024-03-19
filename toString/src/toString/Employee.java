package toString;

public class Employee {

	String name;
	int mobno;
	public Employee(String name, int mobno)
	{
		this.name=name;
		this.mobno=mobno;
		
	}
	public void empDetails()
	{
		System.out.println(name);
		System.out.println(mobno);
	}
	public String toString()
	{
		return "name : "+ name + " mobno :" + mobno;
	}
	


}
