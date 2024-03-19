package nonprim_TypeCasting;

public class Gold extends Metal{
	
	String gold;
	int price;
	

	public Gold(String type, String quality, String gold, int price) {
		super(type, quality);
		this.gold = gold;
		this.price = price;
	}


	public static void main(String[] args) {
		Metal M=new Gold("precious","Good","Goldcoin",50000);
		Gold G=(Gold)M;
		System.out.println(G.type);
		System.out.println(G.quality);
		System.out.println(G.gold);
		System.out.println(G.price);
		

	}

}
