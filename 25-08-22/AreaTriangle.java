/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
  a class named 'Triangle' without any parameter in its constructor.  */

package assignment.java;

public class AreaTriangle {
	public static void main(String args[])
	{
		Triangle t=new Triangle();
		
		t.area=(1/2*(t.b*t.c));
		
		t.peri=t.a+t.b+t.c;
		
	int a=t.area;
	int b=t.peri;
	
	System.out.println("Area:"+a);
	System.out.println("Perimeter:"+b);
		
		
		
	}

}
