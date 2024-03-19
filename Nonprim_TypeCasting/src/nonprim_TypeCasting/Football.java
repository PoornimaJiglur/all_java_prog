package nonprim_TypeCasting;

public class Football extends Sports {
	int eqpoints;
	

	public Football(String favplayer, String origin, int eqpoints) {
		super(favplayer, origin);
		this.eqpoints = eqpoints;
	}


	public static void main(String[] args) {
		Sports S=new Football("Missi","Argentine",9);
		if (S instanceof Football)
		{
			Football F=(Football)S;
			System.out.println(F.favplayer);
			System.out.println(F.origin);
			System.out.println(F.eqpoints);
			
			
			
		}
		else if(S instanceof Cricket)
	
		{
			Cricket C=(Cricket)S;
			System.out.println(C.favplayer);
			System.out.println(C.origin);
			System.out.println(C.noofplayers);
		}

	}

}
