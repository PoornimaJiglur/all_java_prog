package nonprim_TypeCasting;

public class Discovery extends TelevisionNetwork{
	int price;
	String provider;
	

	public Discovery(String category, String quality, String subscription, int price, String provider) {
		super(category, quality, subscription);
		this.price = price;
		this.provider = provider;
	}


	public static void main(String[] args) {
		
		TelevisionNetwork TN=new Discovery("Music","Good","1 year",2500,"TATASky");
		if(TN instanceof Discovery)
		{
			Discovery D=(Discovery)TN;
			System.out.println(D.category);
			System.out.println(D.quality);
			System.out.println(D.subscription);
			System.out.println(D.price);
			System.out.println(D.provider);
		}
		else if(TN instanceof Mtv)
		{
			Mtv M=(Mtv)TN;
			System.out.println(M.category);
			System.out.println(M.quality);
			System.out.println(M.subscription);
			System.out.println(M.language);
			System.out.println(M.chno);
		}

	}

}
