package assignment.java;

public class Product extends AbstractProduct {
	double price;
	Product(int p_id,double p)
	{
		super(1110,"xyz","Map");
		this.price=p;
	}
	void display()
	{
		System.out.println(Product_Id+" "+price);
	}
		
	

}
