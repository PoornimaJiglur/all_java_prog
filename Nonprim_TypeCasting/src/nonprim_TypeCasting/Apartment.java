package nonprim_TypeCasting;

public class Apartment extends Building {
/*	int houses=100;
	int rooms=3; */
	int houses;
	int rooms;
	

	public Apartment(String name,int floors,int cost,int houses, int rooms) {
		super(name,floors,cost);
		this.houses = houses;
		this.rooms = rooms;
	}


	public static void main(String[] args) {
		Building b=new Apartment("Poornima",4,12345,100,3);
		Apartment a=(Apartment)b;
//System.out.println(b.houses); we can not access child properties
		System.out.println(a.name);
		System.out.println(a.floors);
		System.out.println(a.cost);
		System.out.println(a.houses);
		System.out.println(a.rooms);
	
		
	
	}

}
