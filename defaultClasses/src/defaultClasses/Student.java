package defaultClasses;

public class Student {
	
	//overiridng toString method
	int id=1;
	String name="Poornima";
	double marks=453.5;
	
	public String toString()
	{
		return "Student Info : " + id + " " + name + " " + marks;
	}

	public static void main(String[] args) {
		
Student s=new Student();
System.out.println(s);

	}

}
