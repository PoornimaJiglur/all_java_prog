package encapsulation;

public class UML_question {
	
	private double num1;
	private double num2;
	private double num3;
	private double add;
	
	
	public UML_question(double num1, double num2, double num3) {
	
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
			
	}

	public double getNum1()
	{
		return num1;
	}

	public double getNum2()
	{
		return num2;
	}

	public double getNum3()
	{
		return num3;
	}
	public double addition()
	{
		add=num1+num2+num3;
		return add;
	}
	
}
