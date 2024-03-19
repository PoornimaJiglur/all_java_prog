package encapsulation;

public class Bank {
	
	private long accno;//r
	private String accountHolderName;//r+m
	private String ifsc;//r
	private String branch;//r+m
	private long phoneno;//r+m
	private String bal;//r+m
	
	public Bank(long accno, String accountHolderName, String ifsc, String branch, long phoneno, String bal) {
		super();
		this.accno = accno;
		this.accountHolderName = accountHolderName;
		this.ifsc = ifsc;
		this.branch = branch;
		this.phoneno = phoneno;
		this.bal = bal;
	}
	public long getAccno()
	{
		return accno;
	}
	
	public String getIfsc()
	{
		return ifsc;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
		
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
		
	}
	
	public String getBranch()
	{
		return branch;
		
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
		
	}
	public long getPhoneno()
	{
		return phoneno;
		
	}
	public void setPhoneno(long phoneno)
	{
		this.phoneno=phoneno;
		
	}
	public String getbal()
	{
		return bal;
		
	}
	public void setbal(String bal)
	{
		this.bal=bal;
		
	}

}
