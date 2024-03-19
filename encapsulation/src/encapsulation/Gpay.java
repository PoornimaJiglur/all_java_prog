package encapsulation;

public class Gpay {
	private String mobno; //readable and modifiable
	private long cardno;//readable
	private String name;//r+m
	private long accountNo;//r
	private int pin;//r+m
	private double bal;//r+m
	private String ifsc;//r
	private String history;//r
	public Gpay(String mobno, long cardno, String name, long accountNo, int pin, double bal, String ifsc,
			String history) {
		
		this.mobno = mobno;
		this.cardno = cardno;
		this.name = name;
		this.accountNo = accountNo;
		this.pin = pin;
		this.bal = bal;
		this.ifsc = ifsc;
		this.history = history;
	}
	
	public String getMob()
	{
		return mobno;
	}
	public void setMob(String mobno)
	{
		this.mobno=mobno;
	}
	public long getCard()
	{
		return cardno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public long getAcc()
	{
		return accountNo;
	}
	
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	
	
	public double getBal()
	{
		return bal;
	}
	public void setBal(double bal)
	{
		this.bal=bal;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public String getHistory()
	{
		return history;
	}
	
	
}
