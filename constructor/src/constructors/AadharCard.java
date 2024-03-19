package constructors;

public class AadharCard {
	
	String name;
	long ano;
	String address;
	String dob;
		
	AadharCard(String name,long ano,String address,String dob)
	{
		this.name=name;
		this.ano=ano;
		this.address=address;
		this.dob=dob;
	}
	
	public static void main(String[] args) {
		AadharCard A=new AadharCard("Poornima",1312312312,"WhiteField","24-4-1988");
		System.out.println(A.name);
		System.out.println(A.ano);
		System.out.println(A.address);
		System.out.println(A.dob);
		
		AadharCard A1=new AadharCard("Poo",464565465,"JP Nagar","4-3-1990");
		System.out.println(A1.name);
		System.out.println(A1.ano);
		System.out.println(A1.address);
		System.out.println(A1.dob);
		
		AadharCard A2=new AadharCard("Pooja",868678675,"Jayanagar","14-4-1995");
		System.out.println(A1.name);
		System.out.println(A1.ano);
		System.out.println(A1.address);
		System.out.println(A1.dob);

	}

}
