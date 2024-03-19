package nonprim_TypeCasting;

public class Mtv extends TelevisionNetwork{
	String language;
	int chno;
	public Mtv(String category, String quality, String subscription, String language, int chno) {
		super(category, quality, subscription);
		this.language = language;
		this.chno = chno;
	}
	

}
