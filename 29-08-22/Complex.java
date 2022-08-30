/*Create a class complex having a real part(x) and an imaginary part(y). Provide methods to perform the following on complex numbers:
1. Add two complex numbers
2. Multiply two complex numbers*/

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
