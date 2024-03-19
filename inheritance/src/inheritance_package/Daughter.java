package inheritance_package;

public class Daughter extends Mother {
	//multi level inheritance
	String hair="Black";
	int age=20;

	public static void main(String[] args) {
		
 Daughter d=new Daughter();
 d.Grandfeatures();
 System.out.println(d.hair);
 d.Momfeatures();
 System.out.println(d.age);

	}

}
