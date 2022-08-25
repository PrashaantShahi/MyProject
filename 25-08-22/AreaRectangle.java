/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as
   'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of 
   the rectangle. Length and breadth of rectangle are entered through keyboard.  */
package assignment.java;

import java.util.Scanner;

public class AreaRectangle {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Area ar=new Area();
		
		System.out.println("Enter the Length:");
		ar.l=sc.nextInt();
		
		System.out.println("Enter the breadth:");
		
		ar.b=sc.nextInt();
		
		ar.setDim(5,6);
		
		System.out.println(ar.getArea());
		
		
		
		
	}

}