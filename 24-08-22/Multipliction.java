package demo.java;

import java.util.Scanner;

public class Multipliction {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the first number:");
		n1=sc.nextInt();
		System.out.println("Enter the second number:");
		n2=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n1;i++)
		{
			sum=sum+n2;
		}
		System.out.println("The Multiplication of " + n1 + " and " + n2 + " is " + sum);
	}

}
