package chaining;

public class NetFlix extends OTT{
	String movieName;
	String SeriesName;
	int yearofRelease;
	String ratings;
	
	

	public NetFlix(String language, String genre, String movieName, String SeriesName, int yearofRelease,
			String ratings) {
		super(language, genre);
		this.movieName = movieName;
		this.SeriesName = SeriesName;
		this.yearofRelease = yearofRelease;
		this.ratings = ratings;
	}



	public static void main(String[] args) {
		NetFlix n=new NetFlix("Chinese","RomCom","Love O2","Part1",2012,"5 star");
		System.out.println(n.language);
		System.out.println(n.genre);
		System.out.println(n.movieName);
		System.out.println(n.SeriesName);
		System.out.println(n.yearofRelease);
		System.out.println(n.ratings);
		
		

	}

}
