package nonprim_TypeCasting;

public class Circle extends Shape{
	
	double area=3.148*5*5;
	
	



	public Circle(String fill, double area) {
		super(fill);
		this.area = area;
	}





	public static void main(String[] args) {
	Shape s=new Rectangle("red",89,65,5785);
	if(s instanceof Rectangle)
	{
		Rectangle R=(Rectangle)s;
		System.out.println(R.fill);
		
		System.out.println(R.l);
		System.out.println(R.b);
		System.out.println(R.a);
	}
	else if(s instanceof Circle)
	{
		Circle c=(Circle)s;
		System.out.println(c.area);
		System.out.println(c.fill);
	}

	}

}
