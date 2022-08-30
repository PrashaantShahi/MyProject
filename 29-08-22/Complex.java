package assignment.java;

public class Complex {

	int x,y;
	Complex(int r,int imag){
		this.x=r;
		this.y=imag;
	}
public static Complex add(Complex a,Complex b)
{
	Complex c=new Complex(0,0);
	c.x=a.x+b.x;
	c.y=b.y+b.y;
	
	return c;
}

}
