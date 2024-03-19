package arrays;

public class AverageArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int sum=0;
		int total=a.length;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum/total);

		}

	}


