package nonstaticmembers;

public class Employee {
	
	
	int eid;
	String ename;
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1);
		e1.eid=123;
		e1.ename="poornima";
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		
		Employee e2=new Employee();
		System.out.println(e2);
		e2.eid=1234;
		e2.ename="poornima jiglur";
		System.out.println(e2.eid);
		System.out.println(e2.ename);
		
	}

}
