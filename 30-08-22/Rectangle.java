package assignment.java;

public class Rectangle {

	int l,b;
	
	Rectangle(int x,int y)
	{
		this.l=x;
		this.b=y;
	}
	
	
void area()
{
	double area=this.l*this.b;
	System.out.println("Area of rectangle:"+area);
}

void perimeter()
{
	double peri=2*(this.l+this.b);
	System.out.println("Perimeter of rectangle"+peri);
}
}
