package nonprim_TypeCasting;

public class Earth extends Universe {
	
	String satellites;
	int continents;
	String oceans;
	String mountains;
	
	

	public Earth(String galaxy, String blackhole, String spaceship, String satellites, int continents, String oceans,
			String mountains) {
		super(galaxy, blackhole, spaceship);
		this.satellites = satellites;
		this.continents = continents;
		this.oceans = oceans;
		this.mountains = mountains;
	}



	public static void main(String[] args) {
		Universe U=new Earth("Milkyway","Blackhole","Vikarm","chandrayana",7,"Indian","Himalaya");
		Earth E=(Earth)U;
		System.out.println(E.galaxy);
		System.out.println(E.blackhole);
		System.out.println(E.spaceship);
		System.out.println(E.satellites);
		System.out.println(E.continents);
		System.out.println(E.oceans);
		System.out.println(E.mountains);
		
		

	}

}
