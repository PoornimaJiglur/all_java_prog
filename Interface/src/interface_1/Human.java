package interface_1;

public class Human implements Mother, Teacher{
	
	public void superwoman()
	{
		System.out.println("Super Woman");
	}
	

	public static void main(String[] args) {
		
		Mother m=new Human();
		m.superwoman();
		Teacher t=new Human();
		t.superwoman();
		
	}

}
