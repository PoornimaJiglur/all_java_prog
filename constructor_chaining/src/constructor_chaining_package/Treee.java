package constructor_chaining_package;


public class Treee {
	//constructor overloading
		
		String name;
		String use;
		int height;
		int age;
		String root;
		 Treee(String name)
		 {
			 this.name=name;
		 }
		 Treee(String name, int height)
		 {
			 this(name);
			 this.height=height;
			 
		 }
		 Treee(String name, int height,int age)
		 {
			 this(name,height);
			 this.age=age;
		 }
		 Treee(String name, int height,int age,String use)
		 {
			 this(name,height,age);
			 this.use=use;
		 }
		
		public static void main(String[] args) {
			
			Treee t=new Treee("neem",10);
			System.out.println(t.name);
			System.out.println(t.height);

		}

	}