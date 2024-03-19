package paramaterizedmethod;

public class P2 {

	public static void threegreatnum(int a, int b, int c)
	{
		if(a>b&&a>c)
			System.out.println(a+" is greatest num");
		else if(b>c)
			System.out.println(b+" is greatest num");
		else 
			System.out.println(c+" is greatest num");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threegreatnum(8,15,5);
	}

}
