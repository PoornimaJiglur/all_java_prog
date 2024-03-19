package inheritance_package;

public class Whatsapp3 extends Whatsapp2
{


public void video()
{
	System.out.println("Video calling");
	
}

	public static void main(String[] args) {
		Whatsapp3 w=new Whatsapp3();
		System.out.println(w.companyname);
		System.out.println(w.ceoname);
		w.dp();
		w.call();
		w.chat();
		w.text();
		w.feature();
		
				

	}

}
