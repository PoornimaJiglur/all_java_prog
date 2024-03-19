package nonprim_TypeCasting;

public class Kungfu extends MartialArt{
	String weight;
	int age;
	String restriction;
	

	public Kungfu(String origin, String championship, String guide, String weight, int age, String restriction) {
		super(origin, championship, guide);
		this.weight = weight;
		this.age = age;
		this.restriction = restriction;
	}


	public static void main(String[] args) {
		
		MartialArt M=new Kungfu("China","Gold","Minho","50kg",25,"Underage");
		if(M instanceof Kungfu)
		{
			Kungfu K=(Kungfu)M;
			System.out.println(K.origin);
			System.out.println(K.championship);
			System.out.println(K.guide);
			System.out.println(K.weight);
			System.out.println(K.age);
			System.out.println(K.restriction);
			
		}
		else if(M instanceof Karate)
		{
			Karate KR=(Karate)M;
			System.out.println(KR.origin);
			System.out.println(KR.championship);
			System.out.println(KR.guide);
			System.out.println(KR.belt);
			System.out.println(KR.rules);
			
			
		}
	}

}
