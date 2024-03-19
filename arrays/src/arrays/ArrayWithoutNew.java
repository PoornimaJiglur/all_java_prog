package arrays;

public class ArrayWithoutNew {

	public static void main(String[] args) {
		//Creating an array without using new
		int num[]= {1,2,3,4,5,6};
		System.out.println("Length : "+ num.length);
		
		//to fetch value from an array
		for(int index=0;index<=num.length-1;index++)
		{
			System.out.println(num[index]);
		}
		

	}

}
