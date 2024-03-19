package nonprim_TypeCasting;

public class Cat extends CCE_Animal{

	public static void main(String[] args) {
		//UC
		CCE_Animal a=new Cat();
		//DC
	//	Dog d=(Dog)a;//CCE
		//Cat c=(Cat)a;
		//instance of is used to
		System.out.println(a instanceof Cat);
		
		}

}
