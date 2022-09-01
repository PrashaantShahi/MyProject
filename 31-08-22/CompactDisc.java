package assignment.java;

public class CompactDisc extends Product {
	String artist;
	String title;
	
	CompactDisc(int p_id,String a,String t)
	{
		super(1633,348);
		this.artist=a;
		this.title=t;
	}
	void display()
	{
		System.out.println(Product_Id+" "+artist+" "+title);
	}

}
