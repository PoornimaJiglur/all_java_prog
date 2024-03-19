package constructors;

public class Employee {
	
	String empname;
	int empid;
	String dept;
	int age;
	
	Employee(String empname,int empid,String dept,int age)
	{
		this.empname=empname;
		this.empid=empid;
		this.dept=dept;
		this.age=age;
	}
	

	public static void main(String[] args) {
		Employee E=new Employee("Poornima",470,"QA",35);
		System.out.println(E.empname);
		System.out.println(E.empid);
		System.out.println(E.dept);
		System.out.println(E.age);
		
		Employee E1=new Employee("Poo",471,"QA",30);
		System.out.println(E1.empname);
		System.out.println(E1.empid);
		System.out.println(E1.dept);
		System.out.println(E1.age);
		
		Employee E2=new Employee("Pooja",472,"QA",32);
		System.out.println(E2.empname);
		System.out.println(E2.empid);
		System.out.println(E2.dept);
		System.out.println(E2.age);
		

	}

}
