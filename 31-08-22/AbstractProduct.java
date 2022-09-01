package assignment.java;

public abstract class AbstractProduct {

	int Product_Id;
	String Name;
	String Description;
	
	AbstractProduct(int p,String n,String d){
		this.Product_Id=p;
		this.Name=n;
		this.Description=d;
		
	}
	abstract void display();
}
