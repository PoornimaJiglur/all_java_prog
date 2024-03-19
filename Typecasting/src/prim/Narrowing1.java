package prim;

public class Narrowing1 {

	public static void main(String[] args) {
		// double to float
		double d= 34.2;
		float f=(float) d;
		System.out.println(f);
		//double to long
		double d1=54.2;
				long l=(long) d1;
		
		System.out.println(l);
		//double to int
		double d2=12.2;
		int i=(int) d2;
				
		System.out.println(i);
		//double to short
				double d3=122.2;
				short s=(short) d3;
						
				System.out.println(s);
				System.out.println(i);
				//double to byte
						double d4=2.2;
						byte b=(byte) d4;
								
						System.out.println(b);	
						//byte to char
					byte t=65;
					char c=(char)t;
					System.out.println(c);
					//short to char
					short s1=98;
					char r=(char)s1;
					System.out.println(r);
					//char to int
					char c1='A';
					int i1=(int)c1;
					System.out.println(i1);
					//int to char
					int i2= 67;
					char c2=(char)i2;
					System.out.println(c2);
					

	}

}
