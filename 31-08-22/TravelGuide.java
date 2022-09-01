package assignment.java;

public class TravelGuide extends Book {

	String country;
	TravelGuide(int p_id,String c){
		super(103,346,"xyz","jkh");
		this.country=c;
	}
	void display()
	{
		System.out.println(Product_Id+" "+country);
	}
}
