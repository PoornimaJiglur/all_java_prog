package stringConstantPool;

public class SCP3 {

	public static void main(String[] args) {
		String s1=new String("hlo");
		String s2=new String("hlo");
		String s3="hlo";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
