package encapsulation;

public class Account {
	
	private double bal=1000;
	//getter method fetch the data from another class indirectly
	public double getBal()
	{
		return bal;
	}
	//setter method update or modify the private data
	public void setBal(int bal)
	{
		this.bal=bal;
	}
	
}
