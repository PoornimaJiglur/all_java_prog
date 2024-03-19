package interface_1;

public class Rectangle implements Polygon{
	
public void area(int l, int b)
{
	System.out.println(l*b);
}

	public static void main(String[] args) {
		Polygon p=new Rectangle();
		p.area(6,3);

	}

}
