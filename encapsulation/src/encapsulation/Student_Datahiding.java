package encapsulation;

public class Student_Datahiding {
	
	private String name;// Readbale
	private int roll;//r+m
	private int age;//readable
	public Student_Datahiding(String name, int roll, int age) {
	
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public int getAge()
	{
		return age;
	}
	
}
