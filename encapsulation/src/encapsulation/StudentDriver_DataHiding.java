package encapsulation;

public class StudentDriver_DataHiding {

	public static void main(String[] args) {
		Student_Datahiding s=new Student_Datahiding("Poornima", 123, 20);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s.setRoll(456);
		System.out.println(s.getRoll());
				
				
	}

}
