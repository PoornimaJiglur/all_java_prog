package collection;

import java.util.ArrayList;

public class AL {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("poo");
	al.add('a');
	al.add(null);
	al.add(10);
	System.out.println(al);
	System.out.println("=========");
	System.out.println(al.size());
	System.out.println("=========");
	System.out.println(al.get(2));
	//System.out.println(al.get(123));
	System.out.println("========");
	System.out.println(al.contains("poo"));
	System.out.println("========");
	System.out.println(al);
	al.remove(2);
	System.out.println(al);
	System.out.println("================");
	System.out.println(al.isEmpty());
	System.out.println("================");
	System.out.println(al.indexOf(10));
	System.out.println(al.indexOf(100));
	System.out.println(al.lastIndexOf(10));
	ArrayList a=new ArrayList();
	a.add(20);
	a.add(30);
	a.add(20);
	a.add(10);
	System.out.println(a);
	System.out.println("================");
	System.out.println(a.indexOf(10));
	System.out.println("================");
	System.out.println(a.indexOf(100));
	System.out.println("================");
	System.out.println(a.lastIndexOf(20));
	
	
	
	

	}

}
