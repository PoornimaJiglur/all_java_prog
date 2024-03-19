package encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.getSal());
		e.setSale(10000.5);
		System.out.println(e.getSal());
	}

}
