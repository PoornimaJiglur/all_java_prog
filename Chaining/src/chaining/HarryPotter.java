package chaining;

public class HarryPotter extends Novel{
	
	int noofpages;
	String author;
	int volume;
	

	public HarryPotter(String genre, String publications, int chapt, int price, int noofpages, String author,
			int volume) {
		super(genre, publications, chapt, price);
		this.noofpages = noofpages;
		this.author = author;
		this.volume = volume;
	}


	public static void main(String[] args) {
	HarryPotter H=new HarryPotter("Horror","Pearson",13,1500,300,"Arthur",1);
	System.out.println(H.genre);
	System.out.println(H.publications);
	System.out.println(H.chapt);
	System.out.println(H.price);
	System.out.println(H.noofpages);
	System.out.println(H.author);
	System.out.println(H.volume);

	}

}
