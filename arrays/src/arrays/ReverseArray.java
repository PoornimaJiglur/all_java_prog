package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("main starts");
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println("Main ends");
		

	}

}
