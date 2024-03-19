package defaultClasses;

public class Emp {
	
	//over riding toEqual method
	
	int empid;
		
	

	public Emp(int empid) {
			this.empid = empid;
		
	}
public boolean toequals(Object o)
{
	Emp e=(Emp)o;
	return this.empid==e.empid;
	
	
}



	public static void main(String[] args) {
	Emp e1=new Emp(01);
	Emp e2=new Emp(01);
System.out.println(e1.equals(e2));
	}

}
