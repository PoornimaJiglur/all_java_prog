package interface_1;

public class Cricket1 implements Game,Tournaments{
	
	public void play()
	{
		System.out.println("Well Played");
	}
	public void reward()
	{
		System.out.println("Cup");
	}

	public static void main(String[] args) {
	
Game g=new Cricket1();
g.play();
g.reward();
Tournaments t=new Cricket1();
t.play();
t.reward();
	}

}
