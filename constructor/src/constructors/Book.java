package constructors;

public class Book {
	
	String title;
	String author;
	int price;
	
	Book(String title,String author,int price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	public void printdetails()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
		
		
	}

	public static void main(String[] args) {
		
		Book b=new Book("Harry Pottor","ABC",500);
		b.printdetails();
		
		Book b1=new Book("Maths","XYZ",300);
		b.printdetails();
		
		Book b2=new Book("English","UVW",200);
		b.printdetails();
		

	}

}
