package arrays;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		int i[]= {11,13,15,2,4};
		
		for(int index=i.length-1;index>=0;index--)
		{
			System.out.println("Reverse Order : " + i[index]);
			
		}
	}
}
