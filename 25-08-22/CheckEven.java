package assignment.java;

import java.util.Scanner;



public class CheckEven 	
{
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			Number c=new Number();
			
			c.num=sc.nextInt();
			
			boolean flag=c.even();
			System.out.println(flag);
	}

}