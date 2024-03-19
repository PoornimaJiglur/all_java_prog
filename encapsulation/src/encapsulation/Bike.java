package encapsulation;

public class Bike {

	private String brand;//r
	private int mileage;//r+m
	private String seats;//r+m
	private String engine;//r+m
	
	public Bike(String brand, int mileage, String seats, String engine) {
	
		this.brand = brand;
		this.mileage = mileage;
		this.seats = seats;
		this.engine = engine;
	}
	
 public String getBrand()
 {
	 return brand;
 }
 public int getMileage()
 {
	 return mileage;
 }
 public void setmileage(int mileage)
 {
	 return;
 }
 public String getSeats()
 {
	 return seats;
 }
 public void setSeats(int seats)
 {
	 return;
 }
 public String getEngine()
 {
	 return engine;
 }
 public void setEngine(int engine)
 {
	 return;
 }
 
 
}
