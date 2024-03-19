package number;

public class Divisibleby5_dowhile {

	public static void main(String[] args)
	{
	int i=-15;//ini
	do {
		if(i%5==0 &&(i>0 && i%2==0))
		{
			System.out.println(i);
		}
		i++;//up
	}
	while(i<=15);//cond
	}
	

}
