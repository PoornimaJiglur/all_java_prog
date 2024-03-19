package stringMethods;

public class StringMethods {

	public static void main(String[] args) {
	String s="Good Morning Students";
	//To convert String into lower case
	System.out.println(s.toLowerCase());
	System.out.println("------------");
	//to check whether the String is starting with the character sequence
	System.out.println(s.startsWith("G"));
	System.out.println(s.startsWith("go"));
	System.out.println(s.startsWith("G0"));
	System.out.println("---------");
	//to check whether the String is ending with the character sequence
    System.out.println(s.endsWith("Students"));
    System.out.println(s.endsWith("s"));
   //to check the character contains in the string
    System.out.println(s.contains("z"));
    System.out.println(s.contains("o"));
    System.out.println(s.contains("ood"));
    System.out.println(s.contains("oodd"));
    System.out.println("------------------");
    //to fetch the first character
    System.out.println(s.charAt(0)); //o/p=G
    //to fetch the last character
    System.out.println(s.charAt(s.length()-1));//o/p=s
   // System.out.println(s.charAt(s.length())); //SIOBE
    //System.out.println(s.charAt(-1));//SIOBE
	//to fetch inbetween characters
    System.out.println(s.indexOf('M'));
    //-1 represent the character is not available
    System.out.println(s.indexOf('m'));
    System.out.println(s.indexOf('g'));    
    System.out.println(s.indexOf('y'));    
    System.out.println(s.indexOf('o'));   
    System.out.println(s.indexOf(' '));
    System.out.println("---------------");
    // to get last index of repeated character
    System.out.println(s.lastIndexOf('o'));    
    System.out.println(s.lastIndexOf('n')); 
    //to fetch part of the string
    System.out.println(s.substring(14));
    System.out.println(s.substring(1));
    System.out.println(s.substring(1,4));
    System.out.println(s.substring(0,3));
    System.out.println(s.substring(6));
    // System.out.println(s.substring(3,0));//SIOBE
    
    
    
	
    
	}

}
