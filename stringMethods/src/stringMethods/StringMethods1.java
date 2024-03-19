package stringMethods;

public class StringMethods1 {

	public static void main(String[] args) {
		String s="Software Developer";
		System.out.println(s.length());
		System.out.println("=========");
		System.out.println(s.toUpperCase());
		System.out.println("=========");
		System.out.println(s.toLowerCase());
		System.out.println("=========");
		System.out.println(s.startsWith("soft"));
		System.out.println(s.startsWith("Soft"));
		System.out.println("=========");
		System.out.println(s.endsWith("Per"));
		System.out.println(s.endsWith("per"));
		
		System.out.println("=========");
		System.out.println(s.contains("dev"));
		System.out.println(s.contains("Dev"));
		
		System.out.println("=========");
		System.out.println(s.concat(" in ty"));
		System.out.println("=========");
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(6));
		
		System.out.println("=========");
		System.out.println(s.indexOf('f'));
		
		System.out.println("=========");
		
		
		System.out.println("=========");
		String a="java";
		String b="Java";
		String c="java";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println("=========");
		String x="Hello dinga";
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,8));
		
		
	}

}
