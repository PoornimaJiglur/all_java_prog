package nonstaticmembers;

public class Pet {
	
	
		String pName;
		String pchar;
		String pcolor;
		String pgender;
		String page;
	

	public static void main(String[] args) {
	 
	Pet	p=new Pet();
	System.out.println(p);
	p.pName="Kitten";
	p.pchar="silent";
	p.pcolor="White";
	p.pgender="Male";
	p.page="2 Years";
	System.out.println(p.pName);
	System.out.println(p.pchar);
	System.out.println(p.pcolor);
	System.out.println(p.pgender);
	System.out.println(p.page);
	
	Pet	p1=new Pet();
	System.out.println(p1);
	p1.pName="Puppy";
	p1.pchar="Bark";
	p1.pcolor="Brown";
	p1.pgender="Female";
	p1.page="4 Years";
	System.out.println(p1.pName);
	System.out.println(p1.pchar);
	System.out.println(p1.pcolor);
	System.out.println(p1.pgender);
	System.out.println(p1.page);
	
	}

}
