package arrays;

public class CreateArray {
	
	public static void main(String[] args)
	{
		//datatype[] refVar=new datatype[size];
		int[] a=new int[4];
		
		System.out.println("length is : " + a.length);
		//Store data
		a[0]=1;
		a[1]=2;
		a[2]=200;
		a[3]=300;
		// fetch data
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
		
	}

}
