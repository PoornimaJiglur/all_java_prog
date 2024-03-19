package assignment_onlinePart2;

public class WhatsApp2 extends WhatsApp1{
	String theme;
	
	
	public WhatsApp2(double version, String size, String theme) {
		super(version, size);
		this.theme = theme;
	}

	public void audiocall()
	{
		System.out.println("Good Audio Quality");
	}
	
	public static void main(String[] args)
	{
		WhatsApp2 w=new WhatsApp2(12.0,"32MB","dark theme");
		w.message();
		w.audiocall();
		System.out.println(w.version);
		System.out.println(w.size);
		System.out.println(w.theme);
		
	}

}
