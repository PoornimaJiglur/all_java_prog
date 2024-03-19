package nonstaticmembers;

public class Linkdin {
	
	String profile;
	int connection;
 int post;
 int likes;
 
 public void linkd(String pr, int c, int p,int l)
 {
	 profile =pr;
	 connection=c;
	 post=p;
	 likes=l; 
 }
 public void details()
 {
	 System.out.println(profile);
	 System.out.println(connection);
	 System.out.println(post);
	 System.out.println(likes);
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Linkdin L=new Linkdin();
L.linkd("Poornima",32,100,1000);
L.details();


	}

}
