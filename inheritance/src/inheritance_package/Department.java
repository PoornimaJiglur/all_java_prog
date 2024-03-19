package inheritance_package;

public class Department extends College {
	//multi level inheritance
	String dname="CSE";
	String hod="Ganga";
	public void fest()
	{
		System.out.println("Annual day");
		
	}
	

	public static void main(String[] args) {
		
		Department d=new Department();
		System.out.println(d.director);
		System.out.println(d.principal);
		System.out.println(d.uname);
		d.rules();
		System.out.println(d.dname);
		d.placements();
		d.fest();
		System.out.println(d.cname);
		

	}

}
