package assignment.java;

public class Square1 extends Rectangle {
	int side;
	Square1(int s){
		super(0,0);
		this.side=s;
	}
	
	void area() {
		double area=this.side*this.side;
		System.out.println("The area of square:"+area);
	}
	void perimeter() {
		double peri=4*this.side;
		System.out.println("The perimeter of square:"+peri);
	}

}
