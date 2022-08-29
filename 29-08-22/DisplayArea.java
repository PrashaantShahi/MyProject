package assignment.java;

import java.util.Scanner;

public class DisplayArea extends Square{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Square sq=new Square();
		System.out.println("Enter the side:");
		sq.side=sc.nextInt();
		
		sq.Area();
	}

}
