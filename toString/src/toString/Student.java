package toString;

public class Student {

	int id;
	Student(int id)
	{
		this.id=id;
	}
	public boolean equals(Object o)
	{
		Student s=(Student)o;
		return this.id==s.id;
	}
}
