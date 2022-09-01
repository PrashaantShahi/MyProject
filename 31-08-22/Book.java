package assignment.java;

public class Book extends Product {
	int isbn;
	String author;
	String title;
	
	Book(int p_id,int i,String a,String t)
	{
		super(10234,363);
		this.isbn=i;
		this.author=a;
		this.title=t;
	}
	void display() {
		System.out.println(Product_Id+" "+isbn+" "+author+" "+title);
	}
}
