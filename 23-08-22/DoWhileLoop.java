package demo.java;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char c='y';
		
		
		do {
			
			
		
			
			System.out.println("Enter the 1st number:");
			
			int n1=sc.nextInt();
			
			System.out.println("Enter the 2nd number;");
			
			int n2=sc.nextInt();
			
			int sum=0;
			
			sum=n1+n2;
			
			System.out.println("Sum:"+sum);
			
			System.out.println("Enter the choice:");
			
			 c=sc.next().charAt(0);
			
		
			
		}while(c=='y' || c=='Y');
		
	}

}
