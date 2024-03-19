package toString;

public class Toequal {

	public static void main(String[] args) {
	
		Student s1=new Student(111);
		Student s2=new Student(111);
		//System.out.println(s1==s2);//prints the address
System.out.println(s1.equals(s2));
	}

}
