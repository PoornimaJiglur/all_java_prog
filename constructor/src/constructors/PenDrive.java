package constructors;

public class PenDrive {
	
	String brand;
	String storage;
	int price;
	
	PenDrive(String brand,String storage,int price)
	{
		this.brand=brand;
		this.storage=storage;
		this.price=price;
	}
	
	public void printdetails()
	{
		System.out.println(brand);
		System.out.println(storage);
		System.out.println(price);
		
		
	}


	public static void main(String[] args) {
		PenDrive p=new PenDrive("Scandisk","1GB",1000);
		p.printdetails();
		
		PenDrive p1=new PenDrive("Sony","2GB",2000);
		p.printdetails();
		
		PenDrive p2=new PenDrive("Transcend","3GB",3000);
		p.printdetails();
		
		

	}

}
