package constructors;

public class Tree {
//constructor overloading
	
	String name;
	String use;
	int height;
	int age;
	String root;
	 Tree(String name)
	 {
		 this.name=name;
	 }
	 Tree(String name, int height)
	 {
		 this.name=name;
		 this.height=height;
		 
	 }
	 Tree(String name, int height,int age)
	 {
		 this.name=name;
		 this.height=height;
		 this.age=age;
	 }
	 Tree(String name, int height,int age,String use)
	 {
		 this.name=name;
		 this.height=height;
		 this.age=age;
		 this.use=use;
	 }
	
	public static void main(String[] args) {
		
		Tree t=new Tree("neem",10);
		System.out.println(t.name);
		System.out.println(t.height);

	}

}
