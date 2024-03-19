package inheritance_package;

public class flowers extends Plant {
	
	public void flower()
	{
		System.out.println("Rose");
	}

	public static void main(String[] args) {
	
		flowers f=new flowers();
		f.flower();
		Fruitsbased fb=new Fruitsbased();
		fb.fruits();
		Plant p=new Plant();
		p.allplant();
		Trees t=new Trees();
		System.out.println(t.height);
		t.Treefeatures();
		Size s=new Size();
		s.big();
		Small s1=new Small();
		s1.small();
		
	}

}
