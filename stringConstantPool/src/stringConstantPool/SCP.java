package stringConstantPool;

public class SCP {

	public static void main(String[] args) {
		String s="Good Morning";
		String s1="Good Morning";
		String s2="Hi";
		System.out.println(s); // toString is oevrrriden by replacing reference to value
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
	}

}
